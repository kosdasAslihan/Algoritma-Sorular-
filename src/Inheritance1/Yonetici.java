package Inheritance1;

public class Yonetici extends Calisan { //SubClass

    // Yonetici Java'nın Calisan Java'dan özellikleri ve metodları miras almasını sağlayacağız.
    // extends Calisan yazdığımızda Calisan Class'ındaki bütün özellikleri ve bütün metodları bu classa almış olduk.

    private int sorumlu_kisi; //Ekstra özellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        Calisan Java'nın özelliklerine direkt erişemiyoruz */

        super(isim,maas,departman); //superclass'ın içindeki 1 tane constructor'ı çağırmış olduk.
        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara " + zam_miktari + " tl zam yapıldı.");
    }

    public void bilgilerigoster() {

        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maaş: " + getMaas());
        System.out.println("Departman: " + getDepartman());*/
        super.bilgilerigoster();

        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
    }



}


