package GunlukCalismalarim;

public class OOPGiris {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;


    public void setModel(String model) {

        this.model = model; // this şu anki objemizi gösteren bir tane referanstır.
                            // yukarıda String model yerine String modelasd yazsaydık this yazmamıza gerek yoktu.


    }
    public String getModel() {
        return model; // return this.model şeklinde de yazılabilir.

    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0 ) {
            System.out.println("Kapı Sayısı 0'dan Küçük Olamaz...");
        }
       else {
           this.kapilar = kapilar;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
