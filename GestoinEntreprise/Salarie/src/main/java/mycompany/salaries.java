package mycompany;
import vente.Vendeur;
public class salaries {
    public static void main(String[] args) {
        int cmp = 0;
        TabSalaries tableau = new TabSalaries();
        tableau.getSalaries().add(new Employe("Mohamed", ++cmp, 50, 15.0));
        tableau.getSalaries().add(new Employe("Samia", ++cmp, 85, 15.0));
        tableau.getSalaries().add(new Vendeur("Ali", ++cmp, 50, 15.0,200,10.0));
        tableau.getSalaries().add(new Directeur("Mohamed", ++cmp, 5000,200,5));
        tableau.afficherSalarie();
        System.out.println("----------Aprés supression du salaire à la position 0--------");
        tableau.removeSalarie(0);
        tableau.afficherSalarie();
        for (Salarie sal:tableau.getSalaries()) System.out.println(sal.calculePaye());
        System.out.println(tableau.totalPayer());
    }
}

//completer le reste (voir 11 oct)