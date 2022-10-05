package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.StatusAttacks.Growth;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skiddo extends Pokemon {
    public Skiddo(final String name, final int level){
        super(name,level);
        setStats(66,65,48,62,57,52);
        setType(Type.WATER, Type.GRASS);
        setMove(new RockSlide(),new RazorLeaf(),new Growth(), new AerialAce());
    }
}
