package pokemons;

import moves.special.Blizzard;
import moves.status.Charm;
import moves.status.Confide;
import moves.special.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mesprit extends Pokemon {
    public Mesprit (String name, int level) {
        super(name, level);

        super.setStats(80, 105, 105, 105, 105, 80);
        super.setType(Type.PSYCHIC);
        super.setMove(new Blizzard(), new Charm(), new Confide(), new Thunderbolt());
    }
}
