package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DrillRun extends PhysicalMove {
    public DrillRun() {
        super(Type.GROUND, 80, 95);
    }

    @Override
    protected String describe() {
        return "использует DrillRun";
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (Math.random() < 1.0/8) {
            System.out.println("critical");
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
