package beans;

public class AeroportBean {

    private AvionBean place1;
    private AvionBean place2;

    public int placeLibre() {
        if (place1 == null) {
            return 1;
        }
        else if (place2 == null) {
            return 2;
        }
        else {
            return -1;
        }
    }

    public String park(AvionBean avion, int position) {
        if (position == 1 ) {
            if(place1 == null) {
                place1 = avion;
                return "ok";
            }
            else {
                return "La place 1 est occupée";
            }
        }
        else if (position == 2 ) {
            if(place2 == null) {
                place2 = avion;
                return "ok";
            }
            else {
                return "La place 2 est occupée";
            }
        }
        else {
            return "Position incorrecte";
        }

    }

    public void etat(){
        System.out.print("Place1 = ");
        if(place1 != null) {
            System.out.println(place1.getNom());
        }
        else {
            System.out.println(" vide");
        }

        System.out.print("Place2 = ");
        if(place2 != null) {
            System.out.println(place2.getNom());
        }
        else {
            System.out.println(" vide");
        }
    }

}
