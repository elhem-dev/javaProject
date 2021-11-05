import beans.MaisonBean;

import java.util.Random;

public class ExoMaison {

    public static void main(String[] args) {

//        //exo1();
//        MaisonBean m = new MaisonBean();
//        System.out.println(m);
//
//        m.largeur = 10;
//        m.longueur = 12;
//        printMaison(m);
//
//        MaisonBean m2 = new MaisonBean();
//        m2.largeur = 10;
//        m2.longueur = 12;
//        printMaison(m2);
//
//        MaisonBean m3 = null;
//
//        MaisonBean max = bigMaison(null, m);
//        printMaison(max);

        // exo2();

        MaisonBean[] tableau = new MaisonBean[10];
        createMaisons(tableau);
        printMaisons(tableau);
        MaisonBean max = bigMaison(tableau);
        System.out.println("Maison max : ");
        printMaison(max);

    }

    /**
     * Remplit le tableau de maison avec des largeurs et longueurs aléatoires
     */
    public static void createMaisons(MaisonBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                //V1
                MaisonBean m = new MaisonBean();
                m.setLargeur(new Random().nextInt(100));
                m.setLongueur(new Random().nextInt(100));
                tab[i] = m;
                //V2
                tab[i] = new MaisonBean();
                tab[i].setLargeur(new Random().nextInt(100));
                tab[i].setLongueur(new Random().nextInt(100));
            }
        }
    }

    /**
     * Affiche les maisons avec leur taille. 1 maison par ligne
     */
    public static void printMaisons(MaisonBean[] tab) {
        if (tab != null) {
            for (MaisonBean maisonBean : tab) {
                printMaison(maisonBean);
            }
        }

    }

    /**
     * Retourne la maison la plus grande (Longueur * largeur)
     */
    public static MaisonBean bigMaison(MaisonBean[] tab) {
        if(tab == null || tab.length == 0) {
            return null;
        }

        MaisonBean max = tab[0];

        for (MaisonBean maisonBean : tab) {
            if (maisonBean.getSurface() > max.getSurface()) {
                max = maisonBean;
            }
        }

        return max;
    }


    public static void exo2() {
//        Créer un tableau de maison de taille 5
        MaisonBean[] tab = new MaisonBean[5];

//        Afficher dans la console la 3eme case du tableau
        System.out.println(tab[3]);

//        Que peut-on en conclure ? Je n'ai pas crée de maison mais des emplacements

//        Créer une maison m1 de largeur 10
        MaisonBean m1 = new MaisonBean();
        m1.setLargeur(10);
//        Mettre m1 dans la case 0, 1 et 2 du tableau
        tab[0] = m1;
        tab[1] = m1;
        tab[2] = m1;

//        Afficher la largeur des 3 première cases du tableau
        System.out.println("tab[0].largeur=" + tab[0].getLargeur());
        System.out.println("tab[1].largeur=" + tab[1].getLargeur());
        System.out.println("tab[2].largeur=" + tab[2].getLargeur());

//        Mettre la largeur de la 1er case à 20
        tab[0].setLargeur(20);

//        Afficher la largeur des 3 première cases du tableau
        System.out.println("tab[0].largeur=" + tab[0].getLargeur());
        System.out.println("tab[1].largeur=" + tab[1].getLargeur());
        System.out.println("tab[2].largeur=" + tab[2].getLargeur());

//        Que peut on en conclure ?
        //C'test la même maison qui est dans les 3 cases
//                Que va il se passer si on affiche la largeur de la 4eme case du tableau ?
        System.out.println(tab[3]);
        System.out.println(tab[3].getLargeur());
    }

    public static void exo1() {

//        Créer une variable m de type beans.MaisonBean avec null
        MaisonBean m = null;
//        Afficher m dans la console
        System.out.println("m=" + m);
//        Créer une maison et la mettre dans m
        m = new MaisonBean();
//        Afficher m dans la console
        System.out.println("m=" + m);
//        Définir la largeur  de m à 5
        m.setLargeur(5);
//        Afficher la largeur de m dans la console
        System.out.println("m.largeur=" + m.getLargeur());
//        Créer une variable m2 et lui assigner m
        MaisonBean m2 = m;
//        Afficher m2 et la largeur de m2
        System.out.println("m2=" + m2);
        System.out.println("m2.largeur=" + m2.getLargeur());
//        Changer la largeur de m2  à 10
        m2.setLargeur(10);
//        Afficher la largeur de m et de m2
        System.out.println("m.largeur=" + m.getLargeur());
        System.out.println("m2.largeur=" + m2.getLargeur());
    }

    /**
     * Affiche la largeur, longueur de la maison.
     * Exemple attendu :     12x25
     */
    public static void printMaison(MaisonBean m) {
        if (m == null) {
            System.out.println("Maison nulle");
        } else {
            System.out.println(m.getLargeur() + "x" + m.getLongueur());
        }
    }

    /**
     * Double la taille de la maison
     */
    public static void doubleMaison(MaisonBean m) {
        if (m != null) {
            m.setLargeur(m.getLargeur() * 2);
            m.setLongueur(m.getLongueur() * 2);
        }
    }

    /**
     * Retourne la maison la plus grande, et null si de la même taille
     */
    public static MaisonBean bigMaison(MaisonBean m1, MaisonBean m2) {
        if (m1 == null) {
            return m2;
        } else if (m2 == null) {
            return m1;
        } else if (m1.getSurface() > m2.getSurface()) {
            return m1;
        } else if (m1.getSurface() < m2.getSurface()) {
            return m2;
        } else {
            return null;
        }
    }
}
