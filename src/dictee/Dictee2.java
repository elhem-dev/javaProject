package dictee;

public class Dictee2 {

    public static void main(String[] args) {
        String res = m3(8, "hello");
        System.out.println("res=" + res);
        double res2 = m4(5, 7, 2, 8);
        System.out.println("res2=" + res2);
    }

    public static String m3(int p1, String s1) {
        String concat = s1 + p1;
        return concat;
    }

    public static double m4(int p1, int p2, int p3, int p4) {
        int total = p1 + p2 + p3 + p4;
        return (double) total / 4;
    }
}
