package attacks;

import ru.ifmo.se.pokemon.*;

public final class FlashCannon extends SpecialMove {
    public FlashCannon() {
        super(Type.STEEL, 80, 1);
    }

    @Override
    protected String describe() {
        return "применяет Flash Cannon";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}

