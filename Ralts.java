package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);

        setStats(28, 25, 25, 45, 35, 40);

        setType(Type.FAIRY, Type.PSYCHIC);
        setMove(new CalmMind(), new HealPulse());
    }
}
