# Cкопировать файл whiscash9 в директорию lab0/kricketot2/spoink
#Add writing rigtht
chmod u+w $DIR/kricketot2/spoink/
cp $DIR/whiscash9 $DIR/kricketot2/spoink/
#Remove rights
chmod u-w $DIR/kricketot2/spoink/

# Cоздать символическую ссылку для файла claydol3 с именем lab0/kricketot2/psyduckclaydol
ln -s $DIR/claydol3 $DIR/kricketot2/psyduckclaydol

# Cоздать символическую ссылку c именем Copy_77 на директорию drowzee7 в каталоге lab0
ln -s $DIR/drowzee7 $DIR/Copy_77

# Cкопировать содержимое файла whiscash9 в новый файл lab0/drowzee7/staryuwhiscash
cat $DIR/whiscash9 > $DIR/drowzee7/staryuwhiscash

# Cоздать жесткую ссылку для файла lillipup9 с именем lab0/dragonair6/excadrilllillipup
ln $DIR/lillipup9 $DIR/dragonair6/excadrilllillipup

# Oбъеденить содержимое файлов lab0/kricketot2/psyduck, lab0/dragonair6/krokorok,
# в новый файл lab0/whiscash9_44
cat $DIR/kricketot2/psyduck $DIR/dragonair6/krokorok > $DIR/whiscash9_44


# Cкопировать рекурсивно директорию dragonair6 в директорию lab0/dragonair6/dwebble

#Add writing and reading rights
chmod u+w $DIR/dragonair6/dwebble
chmod u+r $DIR/dragonair6/shellos
cp -R $DIR/dragonair6/* $DIR/dragonair6/dwebble/ 2>/dev/null
#Remove rights
chmod u-w $DIR/dragonair6/dwebble
chmod u-r $DIR/dragonair6/shellos
