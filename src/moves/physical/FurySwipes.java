package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class FurySwipes extends PhysicalMove {

    private int currentHit;
    private int hitsAmount;

    public FurySwipes(){
        super(Type.NORMAL, 18, 80, 0, 5);
        currentHit = 0;
    }

    public static int calculateHits() {
        double[] probabilities = {3.0 / 8.0, 3.0 / 8.0, 1.0 / 8.0, 1.0 / 8.0};
        int[] hits = {2, 3, 4, 5};

        Random random = new Random();
        double randValue = random.nextDouble();

        double cumulativeProbability = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            cumulativeProbability += probabilities[i];
            if (randValue <= cumulativeProbability) {
                return hits[i];
            }
        }
        return hits[0];
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        if (currentHit == 0) hitsAmount=calculateHits();

        currentHit++;

        boolean isAttacking = currentHit <= hitsAmount;

        if (currentHit == 5) {
            currentHit = 0;
        }

        return isAttacking;
    }

    @Override
    protected String describe() {
        return "использует FurySwipes";
    }
}
