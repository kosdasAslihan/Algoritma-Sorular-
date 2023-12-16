package FinalAnahtarKelimesi;

public class FinalTest {
    /*public final int obje_sayisi = 4;
    public final int obje_sayisi;

    public FinalTest() {
        //obje_sayisi = 5; yukarıda değer verdiğimiz için tekrar değer verince hata veriyor.
        //obje_sayisi = 4;
    }
    public void deneme() {
        //obje_sayisi = 5; değeri constructor içinde veya tanımlanırken vermemiz lazım, başka methodda değer veremiyoruz.

    }*/

    public final int obje_sayisi;

    public static int say = 0;
    public final String isim;
    public FinalTest(String isim) {

        this.isim = isim;
        say++;
        obje_sayisi = say;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
}
