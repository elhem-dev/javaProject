import java.util.Random;

public class ExoTab {

    public static void main(String[] args) {
        exo1();
//        //Exo2
//        int v1 = 0;
//        int[] tab = new int[]{0, 0, 0};
////        exo2(v1, tab);
////        System.out.println("v1=" + v1);
////        //value va prendre tout les éléments de ma collection
////        for(int value : tab) {
////            System.out.print(value + " ");
////        }
////        System.out.println();
//
//        fillTab(tab);
//        printTab(tab);
//        int max = getMax(tab);
//        System.out.println("max=" + max);


    }

    public static void fillTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }
    }

    /**
     * Affiche le tableau dans la console sur 1 seule ligne
     */
    public static void printTab(int[] tab) {
        //V1 avec for
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }
//        System.out.println();

        //V2 avec foreach
        for (int v : tab) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    /**
     * Retourne la valeur maximum du tableau
     */
    public static int getMax(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * Permute l’emplacement i et j dans le tableau
     * {5, 8, 4, 2} permute de 0 et 3   {2, 8, 4, 5}
     * {2, 8, 4, 2}
     */
    public static void permute(int[] tab, int i, int j) {
        int save = tab[i];
        tab[i] = tab[j];
        tab[j] = save;
    }

    public static int somme(int[] tab) {
        int sum = 0;
        for (int v : tab) {
            sum += v;
        }

        return sum;
    }

    public static double moyenne(int[] tab) {
        int sum = somme(tab);
        return sum / (double) tab.length;
    }


    public static void nbSuppMoy(int[] tab) {
        double moyenne = moyenne(tab);
        for (int v : tab) {
            if (v > moyenne) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
    }

    public static int NbMax02N(int[] tab) {
        double max = getMax(tab);
        int nbMax = 0;
        for (int v : tab) {
            if (v == max) {
                nbMax++;
            }
        }
        return nbMax;
    }

    public static int NbMax0N(int[] tab) {
        double max = tab[0];
        int nbMax = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                nbMax = 1;
            } else if (tab[i] == max) {
                nbMax++;
            }
        }
        return nbMax;
    }

    /**
     * t1  : {3, 7 , 4}
     * t2  : {4, 1 , 14, 5}
     * fusioin {3, 7, 4, 0, 0, 0, 0 }
     */
    public static int[] fusion(int[] tab1, int[] tab2) {
        int[] fusion = new int[tab1.length + tab2.length];

        for (int iT1 = 0; iT1 < tab1.length; iT1++) {
            fusion[iT1] = tab1[iT1];
        }

        for (int iT2 = 0; iT2 < tab2.length; iT2++) {
            fusion[iT2 + tab1.length] = tab2[iT2];
        }


        return fusion;
    }

    public static int[] fusionV2(int[] tab1, int[] tab2) {
        int[] fusion = new int[tab1.length + tab2.length];
        int iFusion = 0;

        for (int v : tab1) {
            fusion[iFusion] = v;
        }
        for (int v : tab2) {
            fusion[iFusion] = v;
        }

        return fusion;
    }


    public static void exo2(int p1, int[] tab) {
        p1++;
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }


    public static void exo1() {
//        Créer un tableau de taille 5 contenant les valeurs (2, 5, 8, 12 et 20)
        int[] tab = new int[]{2, 5, 8, 12, 20};

//        Afficher sa case numéro 4
        System.out.println("tab[4]=" + tab[4]);

//        Dans sa case numéro 2 mettre la valeur 12
        tab[2] = 12;

//        Afficher la taille du tableau
        System.out.println("taille=" + tab.length);

        //        Pour chaque case, afficher sa position et sa valeur. Ex: 0:3 1:5 3:8
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + ":" + tab[i] + " ");
        }
        System.out.println();

//        Incrémenter de 1 chaque case {2 ,4, 7} -> { 3, 5, 8}
        for (int i = 0; i < tab.length; i++) {
            tab[i]++; // = tab[i] + 1;
        }

        //Afficher l'ensemble des valeurs du tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

//        En partant de la valeur de la 1ere case, faire en sorte que chaque case suivante incrémente de 1. Exemple 1er case 3 -> { 3, 4, 5 ,6 ,7 ,8}
        //v1
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[0] + i;
        }

//        Afficher la somme des éléments du tableau
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("sum = " + sum);
    }
}
