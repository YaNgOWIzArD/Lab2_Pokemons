package attacks;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected String describe() {
        return "применяет Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().chance(1).stat(Stat.ATTACK, 2));
        Effect.confuse(pokemon);
    }
}
