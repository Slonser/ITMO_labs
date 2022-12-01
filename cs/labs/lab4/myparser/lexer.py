from .constants import *
from string import whitespace, digits

def boolean_lexer(string):
    if string == 'true':
        return True, string
    elif string == 'false':
        return False, string
    return None, string

def string_lexer(string):
    json_string = ''
    if not(string.startswith(QUOTE)):
        return None, string
    string = string[1:]
    for c in string:
        if c == QUOTE:
            return bytes(json_string, "utf-8").decode("unicode_escape"), string[len(json_string)+1:]
        json_string += c

def number_lexer(string):
    number = ''
    for c in string:
        if c in digits:
            number += c
            continue
        break

    val = string[len(number):]
    if not len(number):
        return None, string
    if '.' in number:
        return float(number), val
    return int(number), val

def null_lexer(string):
    if len(string) >= NULL_LEN and string[:NULL_LEN] == 'null':
        return True, string[NULL_LEN:]

    return None, string


def lexer(string):
    tokens = []
    while len(string):
        lex_types = [string_lexer, number_lexer, boolean_lexer]
        checked = False
        for type in lex_types:
            value, string = type(string)
            if value is not None:
                tokens.append(value)
                checked = True
                break
        if checked:
            continue
        value, string = null_lexer(string)
        if value is not None:
            tokens.append(None)
            continue
        c = string[0]
        if c in whitespace:
            string = string[1:]
        elif c in SYNTAX:
            tokens.append(c)
            string = string[1:]
    return tokens