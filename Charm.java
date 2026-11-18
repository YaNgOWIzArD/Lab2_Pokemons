package attacks;

import ru.ifmo.se.pokemon.*;

public final class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 1);
    }

    @Override
    protected String describe() {
        return "применяет Charm";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.setMod(Stat.ATTACK, -2);
    }
}
