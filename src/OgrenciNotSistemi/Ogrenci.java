package OgrenciNotSistemi;

public class Ogrenci {
    private String ad;
    private int ogrenciNo;
    private String sinif;
    private Dersler ders1;
    private Dersler ders2;
    private Dersler ders3;

    public Ogrenci(String ad, int ogrenciNo, String sinif, Dersler ders1, Dersler ders2, Dersler ders3) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Dersler getDers1() {
        return ders1;
    }

    public void setDers1(Dersler ders1) {
        this.ders1 = ders1;
    }

    public Dersler getDers2() {
        return ders2;
    }

    public void setDers2(Dersler ders2) {
        this.ders2 = ders2;
    }

    public Dersler getDers3() {
        return ders3;
    }

    public void setDers3(Dersler ders3) {
        this.ders3 = ders3;
    }

    public Ogrenci() {
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", ogrenciNo=" + ogrenciNo +
                ", sinif='" + sinif + '\'' +
                ", ders1=" + ders1 +
                ", ders2=" + ders2 +
                ", ders3=" + ders3 +
                '}';
    }




}
