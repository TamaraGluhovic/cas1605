package VezbeZaTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Planina kopaonik = new Planina("Kopaonik", "Srbija", 2000);
        Alpinista alpinista1 = new Alpinista(100, "Jovan Jovanovic", 28);
        Alpinista alpinista2 = new Alpinista(90, "Ilija Ilic", 10);
        Alpinista alpinista3 = new Alpinista(90, "Petar Petrovic", 5);

        RekreativniPlaninar planinar1 = new RekreativniPlaninar(102,"Milos Milic", 5, "Vojvodina", 1000);
        RekreativniPlaninar planinar2 = new RekreativniPlaninar(103,"Nikola Nikolic", 5, "Vojvodina", 1500);
        RekreativniPlaninar planinar3 = new RekreativniPlaninar(104,"Milos Pantic", 5, "Vojvodina", 2000);

        ArrayList<Planinar> sviPlaninari = new ArrayList<>();
        sviPlaninari.add(alpinista1);
        sviPlaninari.add(alpinista2);
        sviPlaninari.add(alpinista3);
        sviPlaninari.add(planinar1);
        sviPlaninari.add(planinar2);
        sviPlaninari.add(planinar3);
        System.out.println(sviPlaninari);

        for (Planinar p: sviPlaninari) {
                if (p.uspesanUspon(kopaonik)){
                    System.out.println("Planinar moze da se popne");
                }else {
                    System.out.println("Planinar ne moze da se popne");
                }
        }


        int suma = 0;
        for (Planinar p: sviPlaninari) {
            suma += p.clanarina();
        }
        System.out.println("Ukupna clanarina je: " + suma);



    }
}
