package OgrenciNotSistemi;

public class Ogrenci {
    private double fizikNotu;

    private String isim;

    public double getFizikNotu() {
        return fizikNotu;
    }

    public void setFizikNotu(double fizikNotu) {
        this.fizikNotu = fizikNotu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci(double fizikNotu, String isim) {
        this.fizikNotu = fizikNotu;
        this.isim = isim;
    }
}
