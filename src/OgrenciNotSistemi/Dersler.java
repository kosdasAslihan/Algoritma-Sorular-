package OgrenciNotSistemi;

public class Dersler {
    private String ders;
    private String unvan;
    private int notYazili;
    private int notSozlu;
    private Ogretmen ogretmen;

    public Dersler(String ders, String unvan, int notYazili, int notSozlu, Ogretmen ogretmen) {
        this.ders = ders;
        this.unvan = unvan;
        this.notYazili = notYazili;
        this.notSozlu = notSozlu;
        this.ogretmen = ogretmen;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public int getNotYazili() {
        return notYazili;
    }

    public void setNotYazili(int notYazili) {
        this.notYazili = notYazili;
    }

    public int getNotSozlu() {
        return notSozlu;
    }

    public void setNotSozlu(int notSozlu) {
        this.notSozlu = notSozlu;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }
    public double puanHesapla() {
        return getNotSozlu()*0.20 + getNotYazili()*0.80;
    }


    public Dersler() {

    }

    public void ogretmenEkle(Ogretmen ogretmen) {



    }
    public void ogretmenYazdir() {
    }

    @Override
    public String toString() {
        return "Dersler{" +
                "ders='" + ders + '\'' +
                ", unvan='" + unvan + '\'' +
                ", notYazili=" + notYazili +
                ", notSozlu=" + notSozlu +
                ", ogretmen='" + ogretmen + '\'' +
                '}';
    }

}

