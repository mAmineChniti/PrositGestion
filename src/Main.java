public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe(1, "John", "Doe", "HR", 3);
        Employe emp2 = new Employe(2, "Jane", "Smith", "IT", 2);
        Employe emp3 = new Employe(3, "Alice", "Johnson", "Finance", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("Liste des employés:");
        societe.displayEmploye();

        societe.trierEmployeParId();
        System.out.println("\nListe des employés triée par ID:");
        societe.displayEmploye();

        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\nListe des employés triée par nom, département et grade:");
        societe.displayEmploye();

        System.out.println("\nRecherche de 'John': " + societe.rechercherEmploye("John"));
        System.out.println("Recherche de 'Michael': " + societe.rechercherEmploye("Michael"));

        societe.supprimerEmploye(emp2);
        System.out.println("\nListe après suppression de Jane:");
        societe.displayEmploye();
    }
}
