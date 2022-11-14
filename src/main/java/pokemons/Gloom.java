package pokemons;

import moves.Shelmet.Absorb;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish {

    public Gloom(String name, int level){
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(60, 65, 70, 85, 75, 40);
        super.addMove(new Absorb());
    }
}
