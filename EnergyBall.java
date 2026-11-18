package attacks;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 1);
    }

    @Override
    protected String describe() {
        return "применяет Energy Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}
