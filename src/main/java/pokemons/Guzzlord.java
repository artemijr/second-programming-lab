package pokemons;

import moves.Guzzlord.*;
import moves.Guzzlord.AirSlash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Guzzlord extends Pokemon {

    public Guzzlord(String name, int level){
        super(name, level);

        super.setType(Type.DARK, Type.DRAGON);
        super.setStats(223, 101, 53, 97, 53, 43);

       super.setMove(new NightSlash(), new AirSlash(), new DoubleTeam(), new RazorLeaf());

    }
}
