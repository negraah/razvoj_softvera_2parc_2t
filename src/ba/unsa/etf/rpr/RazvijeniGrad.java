package ba.unsa.etf.rpr;

public class RazvijeniGrad extends Grad {

    public RazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public RazvijeniGrad() {
    }

    @Override
    public int brojBolnica() {
        int brojBoln = 0;

        brojBoln+=(getBrojStanovnika()/10000);
        if(getBrojStanovnika()%10000!=0){
            brojBoln+=1;
        }
        return brojBoln;
    }
}
