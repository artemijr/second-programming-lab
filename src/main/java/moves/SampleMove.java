package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends  PhysicalMove {
    public  SampleMove(double  pow, double acc){
        super(Type.DARK, pow, acc);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1];
    }
}
