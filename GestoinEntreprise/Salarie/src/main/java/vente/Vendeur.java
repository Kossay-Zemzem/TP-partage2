package vente;

import mycompany.Employe ; // import com.mycompany.Employe ;pour netBeans

public class Vendeur extends Employe {
    private int ventes ;
    private double pourcentage ;
    public Vendeur(String nom ,int id,int nbrHeures, double prixHeures,int ventes ,double pourcentage){
        super(nom,id,nbrHeures,prixHeures);
        this.ventes=ventes ; this.pourcentage=pourcentage;
    }

    @Override
    public double calculePaye() {
        return super.calculePaye()+pourcentage*ventes/100 ;
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getVentes() {
        return ventes;
    }

    public double getPourcentage() {
        return pourcentage;
    }
}
