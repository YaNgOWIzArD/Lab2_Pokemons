import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class FirstBattle {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Regice("Regice", 18);
        Pokemon p2 = new Sandygast("Sandygast", 25);
        Pokemon p3 = new Palossand("Palossand", 42);
        Pokemon p4 = new Ralts("Ralts", 33);
        Pokemon p5 = new Kirlia("Kirlia", 43);
        Pokemon p6 = new Gardevoir("Gardevoir", 35);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
