package pokemons;

import moves.physical.DrillRun;

public class Fearow extends Spearow {
    public Fearow(String name, int level) {
        super(name, level);

        super.setStats(65, 90, 65, 61, 61, 100);
        super.addMove(new DrillRun());
    }
}
