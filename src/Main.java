import beans.SousMarinBean;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        SousMarinBean squall = new SousMarinBean();
        squall.setNom("Squall");
        squall.plonger();
        squall.plonger();
        squall.remonter();
        squall.remonter();
        squall.remonter();
        System.out.println("Profondeur : " + squall.getProfondeur());
    }


    public static int multiplyFromConsole() {
        int nbr1 = readIntFromConsole();
        int nbr2 = readIntFromConsole();


        return nbr1 * nbr2;
    }

    public static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre  : ");
        int nombre = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne
        return nombre;
    }

    public static void boulangerieInteractive() {
        Scanner scanner = new Scanner(System.in);
        //Permet de choisir un nombre et le met dans la variable nombre
        System.out.print("Veuillez entrer un nombre de croissant : ");
        int nombreCroissant = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        System.out.print("Veuillez entrer un nombre de baguette : ");
        int nombreBaguette = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        boulangerie(nombreCroissant, nombreBaguette);
    }

    public static void boulangerie(int nbCroissant, int nbBaguette) {
        double total = nbCroissant * 1.1 + nbBaguette * 0.9;
        System.out.println("Pour " + nbCroissant + " croissant(s) et " + nbBaguette + " baguettes : " + total + "€");
    }

    public static void crepeInteractive() {
        Scanner scanner = new Scanner(System.in);
        //Permet de choisir un nombre et le met dans la variable nombre
        System.out.print("Veuillez entrer un nombre de crêpe : ");
        int nombreCrepe = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        crepe(nombreCrepe);
    }

    public static void crepe(int nbCrepe) {
        int nbOeufs = nbCrepe / 5;
        int farine = nbCrepe * 20;

        System.out.println("Pour " + nbCrepe + " crêpes il faut : ");
        System.out.println("-" + farine + "g de farine");
        System.out.println("-" + nbOeufs + " oeufs");
    }


    public static void exo1() {
        int i = 7;
        int j = 3;

        int divEnt = i / j;
        int reste = i % j;
        double divVirg = i / (double) j;

        System.out.println("divEnt : " + divEnt);
        System.out.println("reste : " + reste);
        System.out.println("divVirg : " + divVirg);
    }
}
