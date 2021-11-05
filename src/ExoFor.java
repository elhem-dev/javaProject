import java.util.Scanner;

public class ExoFor {

    public static void main(String[] args) {
        //exo1();
        String phrase = "  Une phrase avec Des E et Des Majuscules   ";
        String res = sanslesE(phrase);
        System.out.println("sanslese : #" + res + "#");

        int resInt = nbrA(phrase);
        System.out.println("nbrA : #" + resInt + "#");

        res = aLenvers(phrase);
        System.out.println("aLenvers : #" + res + "#");
    }


    //   U n e _ p h r a s e    -> esarhp enU
    //-1 0 1 2 3 4 5 6 7 8 9 10
    //
    public static String aLenversV2(String entrer) {
        String sortie = "";
        for (int i = entrer.length() - 1; i >= 0; i--) {
            char c = entrer.charAt(i);
            sortie += c;
        }

        return sortie;
    }

    public static String aLenvers(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            //sortie = sortie+  c;
            sortie = c + sortie;
        }

        return sortie;
    }

    public static int nbrA(String entrer) {
        int sortie = 0;
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c == 'a' || c == 'A') {
                sortie++;
            }
        }
        return sortie;
    }

    //   Une phrase avec des e -> Un phras avc ds
    public static String sanslesE(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c != 'e' && c != 'E') {
                sortie += c; //equivalent de sortie = sortie + c;
            }
        }


        return sortie;
    }


    public static void exo1() {
//        Afficher les nombres de 0 à 10
        //for( init; condition pour continuer; incrémentation)
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("\nAfficher les nombres de 5 à 12");
        for (int i = 5; i <= 12; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nAfficher uniquement les nombres paires de 4 à 48");
        for (int i = 4; i <= 48; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nAfficher les nombres de 10 à 0");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nAfficher les nombres de 0 à 10 2 fois, exemple 0 0 1 1 2 2 3 3...");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " " + i + " ");
        }

        System.out.println("\nAfficher les nombres de 0 à 20, 2 fois si impaire 1 fois si pair. Exemple 0 1 1 2 3 3 4 ...");
        for (int i = 0; i <= 20; i++) {
            //pair
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + " " + i + " ");
            }
        }


        System.out.println("\nAfficher les nombres de 0 à 10 30 fois chacun (boucle for dans une boucle for) en retournant à la ligne à chaque changement de nombre.");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nDemander à l'utilisateur un nombre et recommencez jusqu'à ce que ce nombre soit 0");
        Scanner scanner = new Scanner(System.in);

        //version for
        for (int nb = -1; nb != 0; ) {
            System.out.print("Veuillez entrer un chiffre : ");
            nb = scanner.nextInt();
            scanner.nextLine();
        }

        //version while
        int nb = -1;
        while (nb != 0) {
            System.out.print("Veuillez entrer un chiffre : ");
            nb = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("C'est bon");


        System.out.println("\nAfficher : 1 1 2 3 5 8 13 21 ... jusqu'à 987");
        int oldm1 = 1;
        int oldm2 = 0;

        while (oldm1 < 1000) {
            //i = oldm1 + oldm2;
            System.out.println(oldm1);
            int temp = oldm2 + oldm1;
            oldm2 = oldm1;
            oldm1 = temp;
        }
    }

    public static void test0() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un chiffre : ");
        int nb = scanner.nextInt();
        scanner.nextLine();
        if (nb == 0) {
            System.out.println("C'est bon");
        } else {
            test0();
        }
    }

    public static String sanslesVoyelle(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
                sortie += c;
            }
        }
        return sortie;
    }


    public static String sanslesMaj(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c < 'A' || c > 'Z') {
                sortie += c;
            }
        }

        return sortie;
    }

    public static char plusGrandChar(String entrer) {
        char sortie = entrer.charAt(0);
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c > sortie) {
                sortie = c;
            }
        }

        return sortie;
    }


    public static String espace2_(String entrer) {
        String sortie = "";
        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);
            if (c != ' ') {
                sortie += c;
            } else {
                sortie += '_';
            }
        }
        return sortie;
    }

    //"Une phrase avec des e"
    public static String sansEspaceDebut(String entrer) {
        String sortie = "";
        boolean garderEspace = false;

        for (int i = 0; i < entrer.length(); i++) {
            char c = entrer.charAt(i);

            if (c != ' ') {
                sortie += c;
                //A partir du moment ou j'ai rencontré autre chose qu'un espace je garde les futures espaces
                garderEspace = true;
            }
            //si je ne garde pas les espaces
            else if (garderEspace) {
                sortie += c;
            }
        }
        return sortie;
    }

    //"  Toto hello  " -> "Toto hello"
    public static String trim(String entrer) {
        //"  Toto hello  " -> "Toto hello  "
        String sortie = sansEspaceDebut(entrer);
        //"Toto hello  "  -> "   olleh otoT"
        sortie = aLenvers(sortie);
        //"   olleh otoT"  -> "olleh otoT"
        sortie = sansEspaceDebut(sortie);
        //"olleh otoT"  -> "Toto hello"
        return aLenvers(sortie);
    }

    //"  Toto hello  " -> "Toto hello"
//"   "
    public static String trimV2(String entrer) {
        String sortie = "";
        int iDebut = 0;
        int iFin = entrer.length() - 1;
        //trouver 1er char ou la fin de la chaine
        while (iDebut < entrer.length() && entrer.charAt(iDebut) == ' ') {
            iDebut++;
        }

        //trouver le Dernier
        for (; iFin >= 0 && entrer.charAt(iFin) == ' '; iFin--) {
        }

        //Une pour constituer la chaine à partir de ces indices
        for (int i = iDebut; i <= iFin; i++) {
            sortie += entrer.charAt(i);
        }

        return sortie;
    }

    //"Une phrase avec des e"
    public static boolean isPalindrome(String entrer) {
        return aLenvers(entrer).equals(entrer);
    }

    //"Une phrase avec des e"
    public static boolean isPalindromeV2(String entrer) {
        if (entrer.length() == 0) {
            return true;
        }

        for (int iDebut = 0, iFin = entrer.length() - 1; iDebut < iFin; iDebut++, iFin--) {
            if (entrer.charAt(iDebut) != entrer.charAt(iFin)) {
                return false;
            }
        }

        return true;
    }


    //"Une phrase avec des e"
    public static char codeAsciiMoyen(String entrer) {
        //Ma condition de départ
        int sortie = 0;
        //Condition arret : j'ai parrcouru toute la chaine
        for (int i = 0; i < entrer.length(); i++) {
            sortie += entrer.charAt(i);
        }

        return (char) (sortie / entrer.length());
    }

}
