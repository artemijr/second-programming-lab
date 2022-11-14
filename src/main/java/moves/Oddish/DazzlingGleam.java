package moves.Oddish;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public  DazzlingGleam(){
        super(Type.FAIRY, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.30){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1];
    }
}