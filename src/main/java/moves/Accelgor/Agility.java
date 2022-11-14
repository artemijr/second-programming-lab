package moves.Accelgor;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public  Agility(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED, +1);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1];


    }
}
