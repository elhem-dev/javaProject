import java.util.Scanner;

public class Exo {

    public static void main(String[] args) {
        String chaine =  "ab";
        char res = troisieme(chaine);

        System.out.println("res=" + res);
    }

    public static char troisieme(String texte) {
        //controle
        if(texte.length() < 3) {
            return '?';
        }
        return texte.charAt(2);
    }

    public static void maxInteractive() {
        //demander des chiffres
        Scanner scanner = new Scanner(System.in);
        //Permet de choisir un nombre et le met dans la variable nombre
        System.out.print("Veuillez entrer un nombre : ");
        int a = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.print("Veuillez entrer un nombre : ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.print("Veuillez entrer un nombre : ");
        int c = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne


        //Faire la comparaison avec max
        int res = max(a,b,c);
        //Afficher le resultat
        System.out.println("res = " + res);
    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

}
