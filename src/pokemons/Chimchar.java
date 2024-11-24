package pokemons;

import moves.physical.FurySwipes;
import moves.status.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);

        super.setStats(44, 58, 44, 58, 44, 61);
        super.setType(Type.FIRE);
        super.setMove(new FurySwipes(), new WillOWisp());
    }
}
