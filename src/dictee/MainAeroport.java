package dictee;

import beans.AeroportBean;
import beans.AvionBean;

public class MainAeroport {

    public static void main(String[] args) {
        AvionBean a1 = new AvionBean();
        a1.setNom("A1");

        AvionBean a2 = new AvionBean();
        a2.setNom("A2");

        AeroportBean aeroportBean = new AeroportBean();
        int place = aeroportBean.placeLibre();

        String res = aeroportBean.park(a2, place);
        System.out.println("Res=" + res);

        res = aeroportBean.park(a2, place);
        System.out.println("Res=" + res);

        place = aeroportBean.placeLibre();
        res = aeroportBean.park(a1, place);
        System.out.println("res=" + res);

        aeroportBean.etat();

        place = aeroportBean.placeLibre();
        System.out.println("Place = " + place);

    }
}
