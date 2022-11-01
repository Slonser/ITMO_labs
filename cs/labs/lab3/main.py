import re
from typing import Callable, List, Union, TypeVar

ThirdTaskArgType = TypeVar("ThirdTaskArgType")


class Tester:
    def __init__(self, path: str) -> None:
        from json import loads
        from os import access, R_OK

        assert access(path, R_OK), f"Can't access file: {path}"
        self.tests = loads(open(path, "r").read())

    def test(
        self,
        func: Callable[Union[str, ThirdTaskArgType], Union[int, str, List[str]]],
        test_name: Union[None, str] = None,
    ) -> bool:
        if test_name is None:
            test_name = func.__name__
        print(f"Testing function '{test_name}'")
        for i, test in enumerate(self.tests[test_name]):
            res = func(test.get("input"))
            if res == test.get("result"):
                print(f"Test #{i+1} passed! Result: '{res}'")
                continue
            print(f"Test #{i+1} failed! Got '{res}', but expected {test.get('result')}")
        print()


def task1(text: str) -> int:
    pattern = re.compile("8<{O")
    res = pattern.findall(text)
    return len(res)


def task2(text: str) -> List[str]:
    pattern = re.compile(
        "([А-ЯЁA-Z][а-яёa-z]+(\\-[А-ЯЁA-Z][а-яёa-z]+)*) [А-ЯЁA-Z]\\.(\\-[А-ЯЁA-Z]\\.)*[А-ЯЁA-Z]\\.(\\-[А-ЯЁA-Z]\\.)*"
    )
    res = pattern.findall(text)
    res = [match.group(1) for match in pattern.finditer(text)]
    return res


def task3(args: ThirdTaskArgType) -> List[str]:
    pattern_string = ""
    options = args.get("options")
    for c in options.get("symbols"):
        pattern_string += (
            "[А-Яа-яёЁ\\w]{" + str(options.get("len")) + "}"
            if pattern_string != ""
            else ""
        ) + c
    pattern_string += "[А-Яа-яёЁ\\w]*"
    pattern = re.compile(pattern_string)
    res = pattern.findall(args.get("text"))
    return res


def main():
    tester = Tester("tests.json")
    tester.test(task1)
    tester.test(task2)
    tester.test(task3)


if __name__ == "__main__":
    main()
