package attacks;

import ru.ifmo.se.pokemon.*;

public final class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет Calm Mind";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
