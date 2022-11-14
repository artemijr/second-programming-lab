package moves.Guzzlord;

import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove {
    public  AirSlash(){
        super(Type.FLYING, 75, 95);
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
