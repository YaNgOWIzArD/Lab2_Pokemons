package attacks;

import ru.ifmo.se.pokemon.*;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 1);
    }

    @Override
    protected String describe() {
        return "применяет Sludge Bomb";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (Math.random() <= 0.3) {
            Effect.poison(pokemon);
        }
    }
}
