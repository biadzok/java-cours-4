public class Personne {
  private String nom;
  private String prenom;
  private String numSecu;

  public Personne(String nom, String prenom, String numSecu) {
    this.nom = nom;
    this.prenom = prenom;
    this.numSecu = numSecu;
  }

  public String getNom() {
    return this.nom;
  }

  public String toString() {
    return this.nom.toUpperCase() + " " + this.prenom + " : " + this.numSecu;
  }

  public boolean estHomme() {
    return numSecu.charAt(1) == '1';
  }
}