package pokemons;

import moves.status.SlackOff;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Chimchar {
    public Monferno(String name, int level) {
        super(name, level);

        super.setStats(64, 78, 52, 78, 52, 81);
        super.addType(Type.FIGHTING);
        super.addMove(new SlackOff());
    }
}
