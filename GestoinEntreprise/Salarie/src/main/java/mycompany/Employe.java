package mycompany;

public class Employe extends Salarie {
    private int nbrHeures ;
    private double prixHeures ;
    public Employe(String nom ,int id,int nbrHeures, double prixHeures){
        super(nom,id);
        this.nbrHeures=nbrHeures ;
        this.prixHeures=prixHeures ;
    }

    @Override
    public double calculePaye() {
        return nbrHeures*prixHeures ;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public void setPrixHeures(double prixHeures) {
        this.prixHeures = prixHeures;
    }

    public double getPrixHeures() {
        return prixHeures;
    }
}
