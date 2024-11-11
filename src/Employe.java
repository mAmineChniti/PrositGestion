public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepart;
    private int grade;
    Employe(int id, String nom, String prenom, String nomDepart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
        this.grade = grade;
    }
    Employe() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.nomDepart = "";
        this.grade = 0;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNomDepart() {
        return nomDepart;
    }
    public int getGrade() {
        return grade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Employe employe = (Employe) obj;
        return this.id == employe.id && this.nom.equals(employe.nom);
    }
    @Override
    public String toString() {
        return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomDepart=" + nomDepart + ", grade=" + grade + "]";
    }
}
