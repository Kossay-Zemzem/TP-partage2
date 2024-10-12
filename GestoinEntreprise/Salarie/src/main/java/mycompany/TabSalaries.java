package mycompany;

import java.util.ArrayList;

public class TabSalaries {
    private ArrayList <Salarie> salaries ;

    public TabSalaries() {
        salaries=new ArrayList<Salarie>() ;
    }

    public ArrayList<Salarie> getSalaries(){return salaries ;}
    public Salarie getSalarie(int i) { return salaries.get(i); }
    public void addSalarie(Salarie s) {salaries.add(s);}
    public void removeSalarie(int rang) {salaries.remove(rang); }
    public void afficherSalarie() {
        for (Salarie s:salaries) System.out.println(s); }
    public double totalPayer(){
        double somme=0.0 ;
        for (Salarie s:salaries) somme+=s.calculePaye() ;
        return somme ;
    }
}
