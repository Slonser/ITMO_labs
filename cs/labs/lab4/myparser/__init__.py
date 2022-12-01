from .lexer import lexer
from .parser import parse


def loads(string):
    tokens = lexer(string)
    return parse(tokens)[0]
