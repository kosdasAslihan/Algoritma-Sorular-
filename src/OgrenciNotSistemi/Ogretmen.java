package OgrenciNotSistemi;

public class Ogretmen {
   private String ogretmenAd;
   private String ogretmenBrans;

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
}
