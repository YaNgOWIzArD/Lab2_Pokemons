package attacks;

import ru.ifmo.se.pokemon.*;

public final class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 0.9);
    }

    @Override
    protected String describe() {
        return "применяет Rock Slide";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }
}
