package mycompany;

public abstract class Salarie {
    private String nom ;
    private int id ;
    public Salarie(String nom , int id) {
        this.nom=nom ; this.id=id ;
    }
    public abstract double calculePaye();

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Salarié dont l'identifiant"+this.id+"et le nom: "+ this.nom ;
    }
}
