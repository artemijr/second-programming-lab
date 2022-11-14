package pokemons;

import moves.Shelmet.Confide;
import ru.ifmo.se.pokemon.Type;

public class Vileplume extends Gloom {

    public Vileplume(String name, int level){
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(75, 80, 85, 110, 90, 50);
        super.addMove(new Confide());
    }
}
