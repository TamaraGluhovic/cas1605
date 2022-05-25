package VezbeZaTest;

public abstract class Planinar {

    private int indetifikacionibroj;
    private String imeIPrezime;

    public Planinar() {
    }


    public void setIndetifikacionibroj(int indetifikacionibroj) {
        this.indetifikacionibroj = indetifikacionibroj;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Planinar(int indetifikacionibroj, String imeIPrezime) {
        this.indetifikacionibroj = indetifikacionibroj;
        this.imeIPrezime = imeIPrezime;
    }


    public int getIndetifikacionibroj() {
        return indetifikacionibroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }


    public abstract void stampaj();

    public abstract int clanarina ();

    public abstract boolean uspesanUspon(Planina planina);





    @Override
    public String toString() {
        return "Planinar{" +
                "indetifikacionibroj=" + indetifikacionibroj +
                ", imeIPrezime='" + imeIPrezime + '\'' +
                '}';
    }
}
