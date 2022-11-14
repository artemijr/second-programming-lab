package moves.Shelmet;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public  Absorb(){
        super(Type.GRASS, 20, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) -(0.5*(p.getStat(Stat.ATTACK))));}

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1];
    }
}