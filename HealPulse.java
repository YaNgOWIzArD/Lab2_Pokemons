package attacks;

import ru.ifmo.se.pokemon.*;

public final class HealPulse extends StatusMove {
    public HealPulse() {
        super(Type.PSYCHIC, 0, 1);
    }

    protected String describe() {
        return "прим    @Override\nеняет Heal Pulse";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        double maxHP = pokemon.getStat(Stat.HP);
        double currentHP = pokemon.getHP();

        double heal = Math.min(maxHP - currentHP, maxHP * 0.5);

        pokemon.setMod(Stat.HP, (int) -heal);
    }

}
