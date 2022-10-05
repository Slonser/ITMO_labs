package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.StatusAttacks.IronDefense;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Pokemon {
    public Charjabug(final String name, final int level){
        super(name,level);
        setStats(57,82,95,55,75,36);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new XScissor(), new ViseGrip(), new IronDefense());
    }
}
