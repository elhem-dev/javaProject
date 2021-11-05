package jeude;

public class Main {

    public static void main(String[] args) {

        //Donnée
        PartyBean party = new PartyBean("Toto", "Tata");

        //modification des données
        for (int i = 0; i < Constants.NB_TOUR; i++) {
            //Lancer j1
            party.getJ1().roll();
            if (party.getJ1().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
                party.getJ1().add1point();
            }

            //lancer J2
            party.getJ2().roll();
            if (party.getJ2().getCup().getScoreDices() >= Constants.SCORE_TO_REACH) {
                party.getJ2().add1point();
            }
        }

        //Avec Winner
//        PlayerBean winner = party.winner();
//        if(winner != null) {
//            System.out.print(winner.getName() + " a gagné ");
//        }
//        else {
//            System.out.print("Egalité : ");
//        }

        //Affichage console
        if (party.getJ1().getScore() > party.getJ2().getScore()) {
            System.out.print(party.getJ1().getName() + " a gagné ");
        } else if (party.getJ1().getScore() < party.getJ2().getScore()) {
            System.out.print(party.getJ2().getName() + " a gagné ");
        } else {
            System.out.print("Egalité : ");
        }
        System.out.println(party.getJ1().getScore() + " - " + party.getJ2().getScore());
    }
}
