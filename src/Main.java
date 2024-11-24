import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Mesprit("Mespi", 1));
        b.addAlly(new Fearow("Fear", 1));
        b.addAlly(new Chimchar("Chimy", 1));

        b.addFoe(new Spearow("Speary", 1));
        b.addFoe(new Monferno("Monfer", 1));
        b.addFoe(new Infernape("Infern", 1));

        b.go();
    }
}