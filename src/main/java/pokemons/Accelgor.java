package pokemons;

import moves.Accelgor.Agility;
import ru.ifmo.se.pokemon.Type;

public class Accelgor extends Shelmet {

    public Accelgor(String name, int level){
        super(name, level);

        super.setType(Type.BUG);
        super.setStats(80, 70, 40, 100, 60, 145);
        super.addMove(new Agility());
    }
}
