public class RectangleColore extends Rectangle {
  protected String couleur;

  public RectangleColore(double a, double b, String couleur) {
    super(a, b);
    this.couleur = couleur;
  }

  @Override
  public String toString() {
    return super.toString() + "\ncouleur = " + this.couleur;
  }

  @Override
  public boolean equals(Object other) {
        if (this == other)
      return true;
    if (other == null || super.equals(other))
      return false;
    if (other instanceof RectangleColore) {
      RectangleColore rectangle2 = (RectangleColore) other;
      if (this.largeur == rectangle2.largeur && this.hauteur == rectangle2.hauteur
          && this.couleur == rectangle2.couleur)
        return true;
    }
    return false;
  }
}