package AlgoritmaSorulari;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine 700km D şehrine 900km mesafededir.
        Bilet tarifesi :
        Km birim fiyatı: 0.10$
        Yolcu 12 yaşından küçükse toplam fiyat %50 indirim ,
        12 ve 24 yaş arasındaysa %10 indirim ,
        65 yaşından büyükse %30 indirim ,
        Bilet gidiş dönüş alınırsa %20 indirim uygulayan bir app create ediniz.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();
        scanner.nextLine();

        String islemler = "1. B şehri (500km)\n"
                + "2. C şehri (700km)\n"
                + "3. D şehri (900km)\n"
                + "Çıkış için q'ya basınız.";
        System.out.println("***************************************************");
        System.out.println(islemler);
        System.out.println("***************************************************");


        while (true) {

            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;

            }
            else if (islem.equals("1")) {
                int km = 500;
                double kurus = 0.10;
                if (yas < 12) {
                    double indirimOrani = (km*kurus) *0.50;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");

                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus)- indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");

                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;

                }
            }

            else if (islem.equals("2")) {
                int km = 700;
                double kurus = 0.10;
                if (yas < 12) {
                    double indirimOrani = (km*kurus) *0.50;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");

                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus)- indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");

                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;
                }

            }

            else if (islem.equals("3")) {
                int km = 900;
                double kurus = 0.10;

                if (yas < 12) {
                    double indirimOrani = (km * kurus) * 0.50;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");

                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");


                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");


                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;
                }
            }

            else {
                System.out.println("Geçersiz işlem girdiniz.");
            }


        }
    }


}