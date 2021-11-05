package jeude;

public class PlayerBean {

    private String name;
    private CupBean cup = new CupBean() ;
    private int score;

    public PlayerBean(String name){
       this.name = name;
       score = 0;
    }

    public void roll(){
        cup.roll();
    }

    public void add1point(){
        score++;
    }


    /* -------------------------------- */
    // Get/Set
    /* -------------------------------- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CupBean getCup() {
        return cup;
    }

    public void setCup(CupBean cup) {
        this.cup = cup;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
