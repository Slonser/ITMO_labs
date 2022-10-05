package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {

    public Growth(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK,1);
        pokemon.setMod(Stat.SPECIAL_ATTACK,1);
    }

    @Override
    protected String describe() {
        return "uses Growth";
    }

}
