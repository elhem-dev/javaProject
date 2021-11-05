package beans;

public class SousMarinBean {

    private String nom;
    private int profondeur;

    public void plonger() {
        profondeur -=50;
    }

    public void remonter(){
        profondeur +=50;
        if(profondeur > 0) {
            profondeur=0;
        }
    }
    /* -------------------------------- */
    // GET/SET
    /* -------------------------------- */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getProfondeur() {
        return profondeur;
    }
}
