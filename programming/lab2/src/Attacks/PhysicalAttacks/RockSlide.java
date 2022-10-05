package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {

    public RockSlide(){
        super(Type.ROCK,75,90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(new Effect().chance(0.3).success())
            Effect.flinch(p);
    }

    @Override
    protected String describe(){
        return "uses RockSlide";
    }
}
