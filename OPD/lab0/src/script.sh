#!/bin/bash
DIR=`pwd`/lab0

if [ -n "$1" ]
then
	MODE=$1
else
	echo "Введите номер пункта задачи, например: ./script.sh 1"
	exit
fi


if [[ $MODE == 1 ]]; then
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

fi

if [[ $MODE == 2 ]]; then
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

fi

if [[ $MODE == 3 ]]; then
	#Add writing rigtht
	chmod u+w $DIR/kricketot2/spoink/
	cp $DIR/whiscash9 $DIR/kricketot2/spoink/
	#Remove rights
	chmod u-w $DIR/kricketot2/spoink/

	ln -s $DIR/claydol3 $DIR/kricketot2/psyduckclaydol
	ln -s $DIR/drowzee7 $DIR/Copy_77
	cat $DIR/whiscash9 > $DIR/drowzee7/staryuwhiscash
	ln $DIR/lillipup9 $DIR/dragonair6/excadrilllillipup
	cat $DIR/kricketot2/psyduck $DIR/dragonair6/krokorok > $DIR/whiscash9_44
	
	#Add writing and reading rights
	chmod u+w $DIR/dragonair6/dwebble
	chmod u+r $DIR/dragonair6/shellos
	cp -R $DIR/dragonair6/* $DIR/dragonair6/dwebble/ 2>/dev/null
	#Remove rights
	chmod u-w $DIR/dragonair6/dwebble
	chmod u-r $DIR/dragonair6/shellos
fi

if [[ $MODE == 4 ]]; then
	cat $DIR/claydol3 | head -c -1 | wc -c >/tmp/abobus 2>/dev/null
	echo -e "----------------------------------------------------"
	
	ls -1trR $DIR 2>/dev/null | grep "^c" | tail -n 2 
	echo -e "----------------------------------------------------"
	
	grep -niRv "se" $DIR 2>/dev/null
	echo -e "----------------------------------------------------"
	
	ls -Rla lab0/ 2>/dev/null | grep "9\$" |sort -k2r | head -n 3
	echo -e "----------------------------------------------------"
	
	ls -1lSr $DIR/**/* 2>/dev/null | grep -vP '(:$|total|^$|^d)' | tail -n 4 | sort -k 5
	echo -e "----------------------------------------------------"
	
	grep -ni "Ta"  $DIR/claydol3
fi

if [[ $MODE == 5 ]]; then
	chmod 777 $DIR/whiscash9 $DIR/kricketot2/psyduck $DIR/kricketot2/psyduckclayd* $DIR/dragonair6/excadrilllillip* $DIR/dragonair6/* $DIR/dragonair6/  $DIR/drowzee7/chimchar
	rm $DIR/whiscash9
	rm $DIR/kricketot2/psyduck
	rm $DIR/kricketot2/psyduckclayd*
	rm $DIR/dragonair6/excadrilllillip*
	rm -rf $DIR/dragonair6
	rm -rf $DIR/drowzee7/chimchar
fi
