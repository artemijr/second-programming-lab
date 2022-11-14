package moves.Shelmet;



import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);}
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return  "Делает "+ pieces[pieces.length-1];


    }
}


