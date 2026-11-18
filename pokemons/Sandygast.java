package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Sandygast extends Pokemon {
    public Sandygast(String name, int level) {
        super(name, level);

        setStats(55, 55, 80, 70, 45, 15);

        setType(Type.GHOST, Type.GROUND);
        setMove(new RockSlide(), new Bulldoze(), new EnergyBall());
    }


}
