package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ViseGrip extends PhysicalMove {
    public ViseGrip(){
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected String describe() {
        return "uses ViseGrip";
    }
}
