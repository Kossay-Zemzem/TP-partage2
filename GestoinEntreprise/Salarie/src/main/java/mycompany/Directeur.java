package mycompany;

public class Directeur extends Salarie {
    private final double salarie ;
    private final double prime ;
    private final int nbrEmployes ;

    public Directeur(String nom ,int id,double salarie , double prime , int nbrEmployes) {
        super(nom,id);
        this.salarie=salarie ;
        this.prime=prime ;
        this.nbrEmployes=nbrEmployes ;
    }

    @Override
    public double calculePaye() {
        return salarie+prime ;
    }

    public double getSalarie() {
        return salarie;
    }
    public double getPrime() {
        return prime;
    }
    public int getNbrEmployes() {
        return nbrEmployes;
    }
}
