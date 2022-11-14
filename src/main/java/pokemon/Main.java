package pokemon;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon Guzzlord = new Guzzlord("", 1);
        Pokemon Shelmet = new Shelmet("", 1);
        Pokemon Accelgor = new Accelgor("", 1);
        Pokemon Oddish = new Oddish("", 1);
        Pokemon Gloom = new Gloom("", 1);
        Pokemon Vileplume = new Vileplume("", 1);
        b.addAlly(Guzzlord);
        b.addAlly(Shelmet);
        b.addAlly(Accelgor);
        b.addFoe(Oddish);
        b.addFoe(Gloom);
        b.addFoe(Vileplume);
        b.go();
        }
}
