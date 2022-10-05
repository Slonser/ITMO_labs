package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.StatusAttacks.Growth;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gogoat extends Pokemon {
    public Gogoat(final String name, final int level){
        super(name,level);
        setStats(123,100,62,97,81,68);
        setType(Type.GRASS);
        setMove(new RockSlide(),new RazorLeaf(),new Growth());
    }
}
