package moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SlackOff extends StatusMove {
    public SlackOff() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon def, Pokemon att) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        int maxHp = (int) p.getStat(Stat.HP);
        p.setMod(Stat.HP, -maxHp/2);
    }

    @Override
    protected String describe() {
        return "использует SlackOff";
    }
}
