package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.EVASION,1);
    }

    @Override
    protected String describe() {
        return "uses DoubleTeam";
    }
}
