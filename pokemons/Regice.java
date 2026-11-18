package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public final class Regice extends Pokemon {
    public Regice(String name, int level) {
        super(name, level);

        setStats(80, 50, 100, 100, 200, 50);

        setType(Type.ICE);
        setMove(new FocusBlast(), new FlashCannon(), new Stomp(), new Swagger());
    }
}
