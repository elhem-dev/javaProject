package beans;

public class MaisonBean {
    //Attributs
    private  int largeur;
    private int longueur;
    private String couleur;


    //methode public
    public int getSurface(){
        return largeur * longueur;
    }

    /* -------------------------------- */
    // GET/SET
    /* -------------------------------- */

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


}
