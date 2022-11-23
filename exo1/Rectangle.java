public class Rectangle {
  protected double largeur;
  protected double hauteur;

  public Rectangle(double largeur, double hauteur) {
    this.largeur = largeur;
    this.hauteur = hauteur;
  }

  @Override
  public String toString() {
    return "Rectangle :\nlargeur = " + largeur + "\nhauteur = " + hauteur;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other)
      return true;
    if (other == null)
      return false;
    if (other instanceof Rectangle) {
      Rectangle rectangle2 = (Rectangle) other;
      if (this.largeur == rectangle2.largeur && this.hauteur == rectangle2.hauteur)
        return true;
    }
    return false;
  }
}