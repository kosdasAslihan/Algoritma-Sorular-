package OgrenciNotSistemi;

public class FizikDersi {
    private int fizikSozlusu;
    private int fizikSinavi;

    public FizikDersi(int fizikSozlusu, int fizikSinavi) {
        this.fizikSozlusu = fizikSozlusu;
        this.fizikSinavi = fizikSinavi;
    }

    public int getFizikSozlusu() {
        return fizikSozlusu;
    }

    public void setFizikSozlusu(int fizikSozlusu) {
        this.fizikSozlusu = fizikSozlusu;
    }

    public int getFizikSinavi() {
        return fizikSinavi;
    }

    public void setFizikSinavi(int fizikSinavi) {
        this.fizikSinavi = fizikSinavi;
    }

    public double puanHesapla() {
        return getFizikSozlusu()*0.20 + getFizikSinavi()*0.80;
    }
}

