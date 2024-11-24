package moves.physical;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует ShadowClaw";
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
