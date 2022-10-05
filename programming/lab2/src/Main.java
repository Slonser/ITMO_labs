import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon[] allyTeam = new Pokemon[] {
                new Charjabug("Slonser",64),
                new Gogoat("Almadelx", 3),
                new Grubbin("Fokysland",5)
        };

        Pokemon[] foeTeam = new Pokemon[] {
                new Klefki("Jenko13",12),
                new Vikavolt("Someone12469", 32),
                new Skiddo("Qumusabel",20)
        };

        Battle b = new Battle();
        for (var pokemon: allyTeam)
            b.addAlly(pokemon);

        for (var pokemon: foeTeam)
            b.addFoe(pokemon);

        b.go();
    }
}