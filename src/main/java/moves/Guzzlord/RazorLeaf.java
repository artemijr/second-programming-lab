package moves.Guzzlord;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends  PhysicalMove {
    public  RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d/8d;}

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1]+"(наносит урон ип овышает крит)";
    }
}
