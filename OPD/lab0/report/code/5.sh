# Выдаем права для удаления
chmod 700 $DIR/whiscash9 $DIR/kricketot2/psyduck $DIR/kricketot2/psyduckclayd* $DIR/dragonair6/  $DIR/drowzee7/chimchar
chmod 700 $DIR/dragonair6/excadrilllillip* $DIR/dragonair6/*

# Удалить файл whiscash9
rm $DIR/whiscash9

# Удалить файл lab0/kricketot2/psyduck
rm $DIR/kricketot2/psyduck

# Удалить символические ссылки lab0/kricketot2/psyduckclayd*
rm $DIR/kricketot2/psyduckclayd*

# удалить жесткие ссылки lab0/dragonair6/excadrilllillip*
rm $DIR/dragonair6/excadrilllillip*

# Удалить директорию dragonair6
rm -rf $DIR/dragonair6

# Удалить директорию lab0/drowzee7/chimchar
rm -rf $DIR/drowzee7/chimchar
