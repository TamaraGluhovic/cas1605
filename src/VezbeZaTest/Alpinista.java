package VezbeZaTest;

public class Alpinista extends Planinar{


    private int poeni;
    final int maxVisina = 4000;

    public Alpinista() {
    }

    public Alpinista(int indetifikacionibroj, String imeIPrezime, int poeni) {
        super(indetifikacionibroj, imeIPrezime);
        if (poeni <= 0 ){
            this.poeni = poeni;
        }else {
            System.err.println("Nedozvoljeni unos");
        }
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        if (poeni <= 0 ){
            this.poeni = poeni;
        }else {
            System.err.println("Nedozvoljeni unos");
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista " + " ID: " + getIndetifikacionibroj() + " ime: " + getImeIPrezime() + " " + "broj poena: " + getPoeni());
    }

    @Override
    public int clanarina() {
        int clanarina = 1500;
        clanarina = clanarina - (50 * poeni);
        if (clanarina <= 0){
            System.out.println("Clanarina je besplatna");
        }
        return clanarina;

    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        boolean uspesno = true;
        if (planina.getVisinaPlanine() < maxVisina && planina.getVisinaPlanine() > 0){
            return uspesno = true;
        }else {
            return uspesno = false;
        }
    }
}
