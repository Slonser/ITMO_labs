package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.SpecialAttacks.ChargeBeam;
import Attacks.StatusAttacks.IronDefense;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Pokemon {
    public Vikavolt(final String name, final int level){
        super(name,level);
        setStats(77,70,90,145,75,43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new XScissor(), new ViseGrip(), new IronDefense(), new ChargeBeam());
    }
}
