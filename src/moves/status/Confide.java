package moves.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon def, Pokemon att) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }
}