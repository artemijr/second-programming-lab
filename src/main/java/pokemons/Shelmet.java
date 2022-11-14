package pokemons;

import moves.Shelmet.Absorb;
import moves.Shelmet.Confide;
import moves.Shelmet.LeechLife;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shelmet extends Pokemon {

    public Shelmet(String name, int level){
        super(name, level);

        super.setType(Type.BUG);
        super.setStats(50, 40, 85, 40, 65, 25);

        super.setMove(new LeechLife(), new Confide(), new Absorb());
    }
}
