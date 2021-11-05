package jeude;

import java.util.Random;

public class DiceBean {

    private int value = 1;

    //Donne une valeur entre 1 et 6
    public void roll() {
        value = new Random().nextInt(6) + 1;
    }

    /* -------------------------------- */
    // GET/SET
    /* -------------------------------- */

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
