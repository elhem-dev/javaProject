package jeude.ihmcontroler;

import jeude.Constants;
import jeude.PartyBean;

public class Controler {

    //données
    private PartyBean data = new PartyBean("Toto", "Bob");

    //IHM
    private IHM ihm;

    public Controler(IHM ihm) {
        this.ihm = ihm;

        //Cas de départ
        ihm.updateJ1(data.getJ1().getName(), data.getJ1().getScore(), true);
        ihm.updateJ2(data.getJ2().getName(), data.getJ2().getScore(), false);
        ihm.updateDice(data.getJ1().getCup().getD1().getValue(), data.getJ1().getCup().getD2().getValue());

        ihm.setBtRestartVisibility(false);
        ihm.updateMessage("");
    }

    /* -------------------------------- */
    // M2thode d'ecoute de l'IHM
    /* -------------------------------- */

    public void clicBtLancerJ1() {
        //Modification des données
        data.getJ1().roll();
        if (data.getJ1().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
            data.getJ1().add1point();
        }

        //Modifier l'IHM
        ihm.updateJ1(data.getJ1().getName(), data.getJ1().getScore(), false);
        ihm.updateJ2(data.getJ2().getName(), data.getJ2().getScore(), true);
        ihm.updateDice(data.getJ1().getCup().getD1().getValue(), data.getJ1().getCup().getD2().getValue());
    }

    public void clicBtLancerJ2() {
        //Modification des données
        data.getJ2().roll();
        if (data.getJ2().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
            data.getJ2().add1point();
        }
        data.add1Round();

        //Modifier l'IHM
        ihm.updateJ1(data.getJ1().getName(), data.getJ1().getScore(), true);
        ihm.updateJ2(data.getJ2().getName(), data.getJ2().getScore(), false);
        ihm.updateDice(data.getJ2().getCup().getD1().getValue(), data.getJ2().getCup().getD2().getValue());

        ihm.updateRound(data.getRound());
    }

    public void clicBtRestart() {
        System.out.println("Clic sur btLancerJ1");
    }
}
