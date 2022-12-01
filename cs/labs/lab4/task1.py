import myparser
from collections.abc import Iterable

def build_xml(obj,depth = 0):
    res = ""
    space = '\t' * depth

    if isinstance(obj,dict):
        for key,value in obj.items():
            res += f"{space}<{key.replace('<','&lt;').replace('>','&gt;')}>\n{space}\t{build_xml(value,depth + 1)}\n{space}</{key.replace('<','&lt;').replace('>','&gt;')}>\n"
    elif isinstance(obj,list):
        for value in obj:
            res += f"{space}<element>\n{space}\t{build_xml(value, depth + 1)}\n{space}</element>\n"
    else:
        res = f"{obj}"
        if obj is None:
            res =""
    return res


def task1(file="out.json"):
    obj = None
    with open(file) as json:
        obj = myparser.loads(json.read())
    return build_xml(obj)


def task2(file="out.json"):
    from dict2xml import dict2xml
    from json import loads
    with open(file) as j:
        return dict2xml(loads(j.read()))


def task3(file="out.json"):
    import re
    from dict2xml import dict2xml

    example = {'pair_id': 2460032073, 'subject': 'Дискретная математика (базовый уровень)', 'subject_id': 43649, 'note': "", 'type': 'Практические занятия', 'time_start': '10:00', 'time_end': '11:30', 'teacher_id': 100054, 'teacher_name': 'Поляков Владимир Иванович', 'room': '1324 (бывш. 369а)', 'building': 'Кронверкский пр., д.49, лит.А', 'format': 'Очно - дистанционный ', 'work_type': 'Практические занятия', 'work_type_id': 3, 'group': 'ДМ БАЗ 3.5', 'flow_type_id': 2, 'flow_id': 19987, 'zoom_url': "", 'zoom_password': "", 'zoom_info': "", 'bld_id': 13, 'format_id': 2, 'main_bld_id': 13}
    data = []
    with open(file) as json:
        value = json.read().replace("null",'""')
        lessons_count = value.count("pair_id")
        for i in range(lessons_count):
            data.append({})
            for key in example:
                if isinstance(example[key],str):
                    data[-1][key] = eval(list(re.finditer(f'"{key}":\s*("[^"]*")',value))[i].group(1),{'__builtins__': {}})
                if isinstance(example[key],int):
                    data[-1][key] = eval(list(re.finditer('"'+key+'":\s*([^,\}]+)[\},]',value))[i].group(1),{'__builtins__': {}})
    return dict2xml(data)


def task4(file="out.json"):
    import pandas as pd

    with open(file, encoding='utf-8') as inputfile:
        df = pd.read_json(inputfile)

    df.to_csv('out.csv', encoding='utf-8', index=False)



if __name__ == "__main__":
    import timeit
    print(timeit.timeit(task1, number=100)/100)
    print(timeit.timeit(task2, number=100)/100)
    print(timeit.timeit(task3, number=100)/100)
    task4()
