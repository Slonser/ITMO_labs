package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FoulPlay extends PhysicalMove {
    public FoulPlay(){
        super(Type.DARK,95, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon paramPokemon1, Pokemon paramPokemon2) {
        return (0.4D * paramPokemon2.getLevel() + 2.0D) * this.power / 150.0D;
    }

    @Override
    protected String describe() {
        return "uses FoulPlay";
    }
}
