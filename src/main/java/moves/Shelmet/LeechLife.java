package moves.Shelmet;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LeechLife extends PhysicalMove {
    public  LeechLife(){
        super(Type.BUG, 80, 100);
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


