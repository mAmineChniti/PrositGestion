import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    public ArrayList<Employe> employes;
    public SocieteArrayList() {
    employes = new ArrayList<Employe>();
    }
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }
    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int nomCompare = e1.getNom().compareTo(e2.getNom());
                if (nomCompare != 0) {
                    return nomCompare;
                }
                int departCompare = e1.getNomDepart().compareTo(e2.getNomDepart());
                if (departCompare != 0) {
                    return departCompare;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
