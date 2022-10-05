package Pokemons;

import Attacks.PhysicalAttacks.FoulPlay;
import Attacks.SpecialAttacks.FairyWind;
import Attacks.StatusAttacks.DoubleTeam;
import Attacks.StatusAttacks.IronDefense;
import ru.ifmo.se.pokemon.Pokemon;

public class Klefki extends Pokemon {
    public Klefki(final String name, final int level){
        super(name,level);
        setStats(57,80,91,80,87,75);
        setMove(new DoubleTeam(),new IronDefense(), new FairyWind(), new FoulPlay());
    }
}
