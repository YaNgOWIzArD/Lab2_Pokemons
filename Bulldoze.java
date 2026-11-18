package attacks;

import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 1);
    }

    @Override
    protected String describe() {
        return "применяет Bulldoze";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().chance(1).stat(Stat.SPEED, -1));
    }
}
