package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class IronDefense extends StatusMove {
    public IronDefense(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.DEFENSE,2);
    }

    @Override
    protected String describe() {
        return "uses IronDefense";
    }

}
