package pokemons;

import moves.physical.Peck;
import moves.status.DoubleTeam;
import moves.status.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spearow extends Pokemon {
    public Spearow(String name, int level) {
        super(name, level);

        super.setStats(40, 60, 30, 21, 21, 70);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setMove(new Roost(), new Peck(), new DoubleTeam());
    }
}
