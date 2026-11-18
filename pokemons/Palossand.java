package pokemons;

import attacks.*;

public final class Palossand extends Sandygast {
    public Palossand(String name, int level) {
        super(name, level);

        setStats(85, 75, 110, 100, 75, 35);

        addMove(new SludgeBomb());
    }
}
