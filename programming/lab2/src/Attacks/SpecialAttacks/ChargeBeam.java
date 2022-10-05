package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.FLYING,60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,1).chance(0.3));
    }

    @Override
    protected String describe() {
        return "uses ChargeBeam";
    }
}
