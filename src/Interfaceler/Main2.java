package Interfaceler;

public class Main2 {
    public static void main(String[] args) {
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        //IMuhendis muhendis2 = new MakineMuhendisi(true,false); şeklinde yazınca hata veriyor. Interface referans_getir
        //metodunu göremiyor.
        String[] tecrube = {};
        String[] referans = {"Ali Veli","Ayşe Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();


    }
}
