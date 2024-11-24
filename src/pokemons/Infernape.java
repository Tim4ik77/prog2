package pokemons;

import moves.physical.ShadowClaw;

public class Infernape extends Monferno {
    public Infernape(String name, int level) {
        super(name, level);

        super.setStats(76, 104, 71, 104, 71, 108);
        super.addMove(new ShadowClaw());
    }
}
