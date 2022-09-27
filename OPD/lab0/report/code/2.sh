# claydol3: rw--w----
chmod u=rw,g=w,o= $DIR/claydol3

# dragonair6: владелец должен записывать директорию и переходить в нее; 
# группа-владелец должна только переходить в директорию;
# остальные пользователи должны записывать директорию
chmod 312 $DIR/dragonair6

# espeon: владелец должен читать директорию и переходить в нее;
# группа-владелец должна читать, записывать директорию и переходить в нее;
# остальные пользователи должны записывать директорию и переходить в нее
chmod 573 $DIR/dragonair6/espeon

# zoroark: права 771
chmod 771 $DIR/dragonair6/zoroark

# dwebble: права 550
chmod 550 $DIR/dragonair6/dwebble

# excadrill: rw-r-----
chmod u=rw,g=r,o= $DIR/dragonair6/excadrill

# krokorok: права 660
chmod 660 $DIR/dragonair6/krokorok

# shellos: -wx-wxr-x
chmod 335 $DIR/dragonair6/shellos

# drowzee7: -wxrwx-wx
chmod 373 $DIR/drowzee7

# chimchar: владелец должен читать директорию и переходить в нее;
# группа-владелец должна только переходить в директорию;
# остальные пользователи должны записывать директорию
chmod 512 $DIR/drowzee7/chimchar

#drifblim: -wxrw---x
chmod u=wx,g=rw,o=x $DIR/drowzee7/drifblim

# staryu: права 644
chmod 644 $DIR/drowzee7/staryu

# charmander: -wx-wxr-x
chmod 335 $DIR/drowzee7/charmander

# kricketot2: права 770
chmod 770 $DIR/kricketot2

# metapod: владелец должен читать директорию и переходить в нее;
# группа-владелец должна читать, записывать директорию и переходить в нее;
# остальные пользователи должны записывать директорию и переходить в нее
chmod 573 $DIR/kricketot2/metapod

# psyduck: права 400
chmod 400 $DIR/kricketot2/psyduck

# spoink: r-xrwxrwx
chmod 577 $DIR/kricketot2/spoink

# lillipup9: права 400
chmod 400 $DIR/lillipup9

# whiscash9: r-----r--
chmod u=r,g=,o=r $DIR/whiscash9
