import requests
import datetime 

class ITMO_API:

    open_id_base = "https://id.itmo.ru"
    open_id_connect = f"{open_id_base}/auth/realms/itmo/protocol/openid-connect/auth"
    myitmo_base = "https://my.itmo.ru"
    myitmo_login_callback = f"{myitmo_base}/login/callback"
    opend_id_token = f"{open_id_base}/auth/realms/itmo/protocol/openid-connect/token"

    def get_random_string(self, N):
        from secrets import choice
        import string

        return ''.join([choice(string.ascii_lowercase + string.digits) for _ in range(N)])

    def generate_code_challenge(self, mode):
        from base64 import urlsafe_b64encode
        if mode == "S256":
            from hashlib import sha256
            self.code_verifier = self.get_random_string(56)
            hash = sha256()
            hash.update(self.code_verifier.encode())
            self.code_challenge = urlsafe_b64encode(hash.digest()).replace(b'=',b'')
            return self.code_challenge
        raise Exception("Provided not supported code challenge method")

    def init_session(self, login, password):
        import re 
        from urllib.parse import urlparse, parse_qs

        self.session = requests.Session()
        response = self.session.get(self.open_id_connect, params={
            'protocol':'oauth2',
            'response_type':'code',
            'access_type': True,
            'client_id': 'student-personal-cabinet',
            'redirect_uri': self.myitmo_login_callback,
            'scope': 'openid profile',
            'state': 'vjLXX5tLxR',
            'code_challenge_method' : 'S256',
            'code_challenge': self.generate_code_challenge('S256')
        }).text

        login_url = re.search('action="(.+)"',response).group(1).replace("&amp;","&")
        response = self.session.post(login_url, data={
            'username':login, 
            'password': password,
            'credentialId':''
        })
        query_data = parse_qs(urlparse(response.url).query)
        response = self.session.post(self.opend_id_token,data={
            'code': query_data['code'][0],
            'client_id':'student-personal-cabinet',
            'redirect_uri': self.myitmo_login_callback,
            'response_type':'code',
            'audience': True,
            'grant_type':'authorization_code',
            'code_verifier': self.code_verifier
        })
        self.access_token = response.json()['access_token']

    def get_shedule(self, date_start, date_end):
        return self.session.get(f"{self.myitmo_base}/api/schedule/schedule/personal",params={
            'date_start': date_start.strftime("%Y-%m-%d"),
            'date_end': date_end.strftime("%Y-%m-%d"),
        },headers={
            'Authorization': f"Bearer {self.access_token}"
        }).json()
    def get_today_shedule(self):
        now = datetime.datetime.now()
        return self.get_shedule(now,now)

    def __init__(self, login, password):
        from sys import argv

        self.init_session(login, password)



if __name__ == "__main__":
    import getpass
    import json

    login = input("Username: ")
    password = getpass.getpass(prompt='Password: ')

    API = ITMO_API(login, password)
    shed = API.get_today_shedule()['data'][0]["lessons"]
    output = json.dumps(shed)
    
    with open("out.json","w") as out:
        out.write(output)