package VezbeZaTest;

public class RekreativniPlaninar extends Planinar{


    private int tezinaOpreme;
    private String nazivOkruga;
    private int maximalniUspon;
    static int clanarina = 1000;



    public RekreativniPlaninar() {
    }



    public RekreativniPlaninar(int indetifikacionibroj, String imeIPrezime, int tezinaOpreme, String nazivOkruga, int maximalniUspon) {
        super(indetifikacionibroj, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maximalniUspon = maximalniUspon;
    }


    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaximalniUspon() {
        return maximalniUspon;
    }

    public void setMaximalniUspon(int maximalniUspon) {
        this.maximalniUspon = maximalniUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativni planinar "+ " " + "ID: " + getIndetifikacionibroj() + " Ime: " + getImeIPrezime() + " Okrug: " + getNazivOkruga());
    }

    @Override
    public int clanarina() {
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {

        boolean uspesno;
        if ((maximalniUspon - (50 * this.tezinaOpreme)) > planina.getVisinaPlanine()){
            uspesno = true;
        }else {
            System.out.println("Rekreativni planinar nece preci uspon");
        }uspesno = true;

        return uspesno;

    }




}
