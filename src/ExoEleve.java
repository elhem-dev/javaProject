import beans.EleveBean;

import java.util.Random;

public class ExoEleve {

    public static void main(String[] args) {
        EleveBean[] tab = new EleveBean[5];
        createEleves(tab);
        printEleves(tab);
        EleveBean bestBob = bestBob(tab);
        System.out.println("Bestbob : ");
        printEleve(bestBob);

    }

    /**
     * Remplit le tableau d’élève avec des noms et une note aléatoire
     */
    public static void createEleves(EleveBean[] tab) {
        if (tab == null) {
            return;
        }
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new EleveBean();
            tab[i].nom = getRandomName();
            tab[i].note = new Random().nextInt(21);
        }
    }

    /**
     * Affiche les élèves avec leur note
     */
    public static void printEleves(EleveBean[] tab) {
        if (tab == null) {
            System.out.println("Tableau null");
            return;
        }
        for (EleveBean eleveBean : tab) {
            if (eleveBean != null) {
                System.out.println(eleveBean.nom + " : " + eleveBean.note);
            } else {
                System.out.println("null");
            }
        }

    }

    /**
     * Retourne l’élève s’appelant bob ayant la meilleurs note ou null s'il n'y a pas de bob
     */
    public static EleveBean bestBob(EleveBean[] tab) {
        EleveBean bestBob = null;
        if (tab != null) {
            for (EleveBean eleveBean : tab) {
                //J'ai un élève et c'est un bob
                if (eleveBean != null && "bob".equalsIgnoreCase(eleveBean.nom)) {
                    //SI j'ai pas de bestBob enregirstré ou que l'élève en cours à une meilleur note
                    //enregistrée
                    if (bestBob == null || eleveBean.note > bestBob.note) {
                        bestBob = eleveBean;
                    }
                }
            }
        }

        return bestBob;
    }

    /**
     * Retourne un prénom aléatoire
     */
    public static String getRandomName() {
        String[] name = new String[]{"Toto", "Tata", "Titi", "Bob", "Alfred"};
        return name[new Random().nextInt(name.length)];
    }


    public static void methodTest() {
        EleveBean e1 = new EleveBean();
        e1.nom = "toto";
        e1.note = 12;

        EleveBean e2 = new EleveBean();
        e2.nom = "bob";
        e2.note = 8;

        EleveBean e3 = null;


        printEleve(e1);
        printEleve(e2);
        printEleve(e3);
        System.out.println("\n----double note---\n");

        doubleNote(e1);
        printEleve(e1);
        doubleNote(e2);
        printEleve(e2);
        doubleNote(e3);
        printEleve(e3);

        System.out.println("\n----Meilleur élève---\n");
        EleveBean maxE1E2 = meilleurEleve(e1, e2);
        System.out.println("Max e1e2: ");
        printEleve(maxE1E2);

        EleveBean maxE1E3 = meilleurEleve(e1, e3);
        System.out.println("Max e1e3: ");
        printEleve(maxE1E3);

        EleveBean maxEgalite = meilleurEleve(e1, e1);
        System.out.println("Max maxEgalite: ");
        printEleve(maxEgalite);
    }

    /**
     * Affiche le nom et la note de l’élève
     */
    public static void printEleve(EleveBean e) {
        if (e != null) {
            System.out.println(e.nom + " " + e.note);
        } else {
            System.out.println("Elève null");
        }
    }

    /**
     * Double la note de l’élève sans qu'elle ne puisse dépasser 20
     * Si note à 12 l'élève se retrouve avec 20
     */
    public static void doubleNote(EleveBean e) {
        //Ca protege du nullpointerException
        if (e != null) {
            e.note *= 2;
            //Protege du dépassement de la note 20
            if (e.note > 20) {
                e.note = 20;
            }
        }
    }

    /**
     * Retourne l’élève qui a la meilleur note ou nulle en cas
     * d’égalité
     */
    public static EleveBean meilleurEleve(EleveBean e1, EleveBean e2) {
        if (e1 == null) {
            return e2;
        } else if (e2 == null) {
            return e1;
        } else if (e1.note > e2.note) {
            return e1;
        } else if (e1.note < e2.note) {
            return e2;
        } else {
            //egalité
            return null;
        }
    }
}
