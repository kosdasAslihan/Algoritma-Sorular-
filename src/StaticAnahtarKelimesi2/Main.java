package StaticAnahtarKelimesi2;

public class Main {
    public static void main(String[] args) {
        /*StaticClass s1 = new StaticClass("Murat");
        StaticClass s2 = new StaticClass("Mehmet");

        System.out.println("Obje Sayısı: " + StaticClass.obje_sayisi);
        System.out.println("Obje Sayısı: " + s1.obje_sayisi);
        System.out.println("Obje Sayısı: " + s2.obje_sayisi);*/

        //toplama(3,4,5) static olan bir alandan static olmayan yani henüz oluşturulmamış bir alanı kullanmaya çalışınca
        //hata veriyor. ama public void toplama(int a, int b, int c) yerine  public static void toplama yazdığımızda
        //hata ortadan kalkıyor.
    }
    public static void toplama(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
