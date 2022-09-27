# Подсчитать количество символов содержимого файла claydol3, 
# результат записать в файл в директории /tmp, подавить вывод ошибок доступа
wc -c $DIR/claydol3  >/tmp/abobus 2>/dev/null

# Вывести два последних элемента рекурсивного списка имен и атрибутов файлов в директории lab0,
# начинающихся на символ 'c',
# список отсортировать по возрастанию даты модификации файла, подавить вывод ошибок доступа
ls -1trR $DIR 2>/dev/null | grep "^c" | tail -n 2

# Вывести содержимое файлов с номерами строк в директории drowzee7,
# исключить строки, содержащие "se",
# регистр символов игнорировать, подавить вывод ошибок доступа
grep -niRv "se" $DIR 2>/dev/null


# Вывести три первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0,
# заканчивающихся на символ '9',
# список отсортировать по возрастанию количества жестких ссылок, 
# ошибки доступа не подавлять и не перенаправлять
ls -Rla lab0/ 2>/dev/null | grep "9\$" | grep -vE ':$|total|^$|^d' |sort -k2r | head -n 3

# Вывести четыре последних элемента рекурсивного списка имен и атрибутов файлов в директории lab0,
# список отсортировать по возрастанию размера,
# подавить вывод ошибок доступа
ls -1lSr $DIR/**/* 2>/dev/null | grep -vE ':$|total|^$|^d' | tail -n 4 | sort -k 5

# Вывести содержимое файла claydol3 с номерами строк,
# оставить только строки, содержащие "Ta",
# регистр символов игнорировать,
# ошибки доступа не подавлять и не перенаправлять
grep -ni "Ta" $DIR/claydol3
