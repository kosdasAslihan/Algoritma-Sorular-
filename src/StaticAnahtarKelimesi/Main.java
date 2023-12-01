package StaticAnahtarKelimesi;

public class Main {
    public static void main(String[] args) {
        /*Seyirci seyirci1 = new Seyirci("Ali Veli");
        Seyirci seyirci2 = new Seyirci("Ayşe Sayın");

        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayısı: " + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci Sayısı: " + seyirci1.getSeyirci_sayisi());
        System.out.println("Seyirci Sayısı: " + seyirci2.getSeyirci_sayisi());*/

        selamla(); // public void selamla() static olan bir metoddan static olmayan bir metodu direkt olarak çağıramıyoruz.

        System.out.println(Math.PI);

    }

    public static void selamla() { //public void selamla() şeklinde olunca yukarıda kullanamıyoruz
        System.out.println("Selamlar");
    }
}
