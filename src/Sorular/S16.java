package Sorular;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
         /*
          Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
          ve cekme, çıkış işlemlerinin yapıldıgı bir
          ATM app. method create ediniz
         */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;

        String islemler = "1- Bakiye Sorgula\n" +
                "2- Para Yatırma\n" +
                "3- Para Çekme\n" +
                "Çıkış İçin q'ya Basınız.";

        System.out.println("ATM'ye Hoş Geldiniz.");
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while (true) {
            System.out.println("Lütfen bir işlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);

            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz para miktarı: ");
                int yatirilanPara = scanner.nextInt();
                scanner.nextLine();
                bakiye += yatirilanPara;
                System.out.println("Güncel Bakiyeniz: " + bakiye);

            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz para miktarı: ");
                int cekilenPara = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - cekilenPara < 0) {
                    System.out.println("Çekmek istediğiniz miktar bakiyenizden fazla, bakiyeniz: " + bakiye);
                } else {
                    bakiye -= cekilenPara;
                    System.out.println("Kalan Bakiyeniz: " + bakiye);
                }
            } else if (islem.equals("q")) {
                System.out.println("Hesabınızdan çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Lütfen geçerli işlem numarası seçiniz.");
            }
        }
    }
}
