from . import constants

def parse_array(tokens):
    json_array = []
    t = tokens[0]
    if t == constants.RIGHTBRACKET:
        return json_array, tokens[1:]
    while True:
        json, tokens = parse(tokens)
        json_array.append(json)
        t = tokens[0]
        if t == constants.RIGHTBRACKET:
            return json_array, tokens[1:]
        else:
            tokens = tokens[1:]

def parse_object(tokens):
    json_object = {}
    t = tokens[0]
    if t == constants.RIGHTBRACE:
        return json_object, tokens[1:]
    while True:
        json_key = tokens[0]
        if type(json_key) is str:
            tokens = tokens[1:]
        json_value, tokens = parse(tokens[1:])
        json_object[json_key] = json_value
        t = tokens[0]
        if t == constants.RIGHTBRACE:
            return json_object, tokens[1:]
        tokens = tokens[1:]

def parse(tokens):
    t = tokens[0]
    match t:
        case constants.LEFTBRACKET:
            return parse_array(tokens[1:])
        case constants.LEFTBRACE:
            return parse_object(tokens[1:])
    return t, tokens[1:]
