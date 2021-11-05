package dictee;

import beans.PaysBean;

public class MainPays {

    public static void main(String[] args) {
        //Version sans constructeur
//        PaysBean paysBean = new PaysBean();
//        paysBean.setNom("France");
//        paysBean.setPopulation(67_390_000);
//        paysBean.setSurface(632_734);

        //Version avec  constructeur incomplet
//        PaysBean paysBean = new PaysBean("France");
//        paysBean.setPopulation(67_390_000);
//        paysBean.setSurface(632_734);

        //Version avec constructeur
        PaysBean paysBean = new PaysBean("France", 67_390_000, 632_734);


        System.out.println("Densité : " + paysBean.getDensite());

        for (int i = 1; i <= 10; i++) {
            paysBean.setPopulation((long) (paysBean.getPopulation() * 1.01));
            System.out.println("Dans " + i + "année(s) Population=" + paysBean.getPopulation() + " densité=" + paysBean.getDensite());
        }
    }

}
