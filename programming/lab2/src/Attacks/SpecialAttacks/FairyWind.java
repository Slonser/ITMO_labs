package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class FairyWind extends SpecialMove {
    public FairyWind(){
        super(Type.FAIRY,40, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,1).chance(0.3));
    }

    @Override
    protected String describe() {
        return "uses FairyWind";
    }
}
