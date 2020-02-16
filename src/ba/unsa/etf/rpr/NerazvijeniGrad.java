package ba.unsa.etf.rpr;

public class NerazvijeniGrad extends Grad {

    public NerazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public NerazvijeniGrad() {
    }

    @Override
    public int brojBolnica() {
        int brojBoln = 0;

        brojBoln+=(getBrojStanovnika()/100000);
        if(getBrojStanovnika()%100000!=0){
            brojBoln+=1;
        }
        return brojBoln;
    }
}
