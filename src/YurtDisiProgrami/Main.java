package YurtDisiProgrami;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sabiha Gökçen Havalimanına Hoş Geldiniz.");

        String sartlar = "Yurtdışı Çıkış Kuralları:\n"
                       + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
                       + "15 TL harç bedelini tam olarak yatırmanız gerekiyor.\n"
                       + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";


        while (true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Konrtol Ediliyor.");

            if(yolcu.yurtdisiHarciKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor.");

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor.");

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam! Yurtdışına Çıkabilirsiniz.");
            break;

        }
    }
}
