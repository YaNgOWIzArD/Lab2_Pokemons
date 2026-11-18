package attacks;

import ru.ifmo.se.pokemon.*;

public final class Stomp extends PhysicalMove {
    public Stomp() {
        super(Type.NORMAL, 65, 1);
    }

    @Override
    protected String describe() {
        return "применяет Stomp";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }
}
