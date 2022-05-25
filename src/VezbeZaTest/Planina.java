package VezbeZaTest;

public class Planina {
    private String imePlanine;
    private String nazivDrzave;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String nazivDrzave, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzave = nazivDrzave;
        if (visinaPlanine > 0) {
            this.visinaPlanine = visinaPlanine;
        }else {
            System.err.println("Visina planine ne moze biti negativna vrednost");
        }
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        if (visinaPlanine > 0) {
            this.visinaPlanine = visinaPlanine;
        }else {
            System.err.println("Visina planine ne moze biti negativna vrednost");
        }

    }


    @Override
    public String toString() {
        return "Planina{" +
                "imePlanine='" + imePlanine + '\'' +
                ", nazivDrzave='" + nazivDrzave + '\'' +
                ", visinaPlanine='" + visinaPlanine + '\'' +
                '}';
    }
}
