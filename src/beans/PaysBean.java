package beans;

public class PaysBean {
    private String nom;
    private long population;
    private int surface;

    public PaysBean() {

    }

    public PaysBean(String nom) {
        this.nom = nom;
    }

    public PaysBean(String nom, long population, int surface) {
        this.nom = nom;
        this.population = population;
        this.surface = surface;
    }

    public double getDensite(){
        return population/(double)surface;
    }

    /* -------------------------------- */
    // Getter/Setter
    /* -------------------------------- */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
}
