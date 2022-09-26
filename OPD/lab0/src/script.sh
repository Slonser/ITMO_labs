DIR=`pwd`/lab0


# Create directory tree
mkdir -p $DIR/dragonair6/espeon $DIR/dragonair6/zoroark $DIR/dragonair6/dwebble $DIR/dragonair6/shellos
mkdir -p $DIR/drowzee7/chimchar $DIR/drowzee7/drifblim $DIR/drowzee7/charmander
mkdir -p $DIR/kricketot2/metapod $DIR/kricketot2/spoink

# Create files
echo "weigth=238.1 height=59.0 atk=7 def=11" > $DIR/claydol3
echo -e "Ходы Drill\nRun Earth Power Iron Defence Iron Head Magnet Rise Sleep Talk Snore\nStealth Rock" > $DIR/dragonair6/excadrill
echo -e "weight=73.6 height=39.0 atk=8\ndef=5" > $DIR/dragonair6/krokorok
echo -e "Развитые способности Analytic" > $DIR/drowzee7/staryu
echo -e "Способности\nScratch Water Sport Tail Whip Water Gun Disable Confudion Water Pulse\nFury Swipes Screech Zen Headbutt Aqua Tail Soak Psych Up Amnesia Hydro\nPump Wonder Room" > $DIR/kricketot2/psyduck
echo "Тип диеты Omnivore" > $DIR/lillipup9
echo -e "weigth=52.0\nheight=35.0 atk=8 def=7" > $DIR/whiscash9

# Set rights
chmod u=rw,g=w,o= $DIR/claydol3
chmod 753 $DIR/dragonair6
chmod 577 $DIR/dragonair6/espeon
chmod 771 $DIR/dragonair6/zoroark
chmod 550 $DIR/dragonair6/dwebble
chmod u=rw,g=r,o= $DIR/dragonair6/excadrill
chmod 660 $DIR/dragonair6/krokorok
chmod 335 $DIR/dragonair6/shellos
chmod 373 $DIR/drowzee7
chmod 553 $DIR/drowzee7/chimchar
chmod u=wx,g=rw,o=x $DIR/drowzee7/drifblim
chmod 644 $DIR/drowzee7/staryu
chmod 335 $DIR/drowzee7/charmander
chmod 770 $DIR/kricketot2
chmod 577 $DIR/kricketot2/metapod
chmod 400 $DIR/kricketot2/psyduck
chmod 577 $DIR/kricketot2/spoink
chmod 400 $DIR/lillipup9
chmod u=r,g=r,o= $DIR/whiscash9
