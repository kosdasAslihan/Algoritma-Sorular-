package OgrenciNotSistemi;

public class Ogretmen {
    private String ogretmenAd;
    private String ogretmenBrans;

    public Ogretmen() {
    }

    public String getOgretmenAd() {
        return ogretmenAd;
    }

    public void setOgretmenAd(String ogretmenAd) {
        this.ogretmenAd = ogretmenAd;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }

    public Ogretmen(String ogretmenAd, String ogretmenBrans) {
        this.ogretmenAd = ogretmenAd;
        this.ogretmenBrans = ogretmenBrans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ogretmenAd='" + ogretmenAd + '\'' +
                ", ogretmenBrans='" + ogretmenBrans + '\'' +
                '}';
    }
}
