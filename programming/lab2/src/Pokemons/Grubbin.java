package Pokemons;

import Attacks.PhysicalAttacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin(final String name, final int level){
        super(name,level);
        setStats(47,62,45,55,45,46);
        setType(Type.BUG);
        setMove(new XScissor(), new ViseGrip());
    }
}
