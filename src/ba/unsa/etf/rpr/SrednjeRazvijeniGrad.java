package ba.unsa.etf.rpr;

public class SrednjeRazvijeniGrad extends Grad {
    public SrednjeRazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public SrednjeRazvijeniGrad() {
    }

    @Override
    public int brojBolnica() {
        int brojBoln = 0;

        brojBoln+=(getBrojStanovnika()/25000);
        if(getBrojStanovnika()%25000!=0){
            brojBoln+=1;
        }
        return brojBoln;
    }
}
