package GenericClasslar2;

import GenericClasslar.Ogrenci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("YGS LYS Birinci Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                        + "1. Eşit Ağırlık Öğrencileri Birincisi\n"
                        + "2. Sayısal Öğrencileri Birincisi";


        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while (true) {
            System.out.println("Çıkış için q'ya basın.");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            //Birinci Öğrenci
            System.out.print("Birinci Öğrencinin İsmi: ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik): ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            //İkinci Öğrenci
            System.out.print("İkinci Öğrencinin İsmi: ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik): ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();

            //Üçüncü Öğrenci
            System.out.print("Üçüncü Öğrencinin İsmi: ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler(Türkçe Matematik Edebiyat Fizik): ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("İşlemi Giriniz: ");
            String islem = scanner.nextLine();

             if (islem.equals("1")) {
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Eşit Ağırlık Öğrencisi: " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı: " + birinci.puanHesapla());


            } else if (islem.equals("2")) {
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);

                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Sayısal Öğrencisi: " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı: " + birinci.puanHesapla());


            } else {
                System.out.println("Geçersiz işlem.");

            }

        }

    }
    public static <E extends Aday> E birinci (E e1,E e2,E e3) {
        if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        }
        if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        }
        if(e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            return e3;
        }
        else {
            return e1;
        }
    }
}










            /*if (e1.puanHesapla() > e2.puanHesapla()) {
                return e1;
            } else {
                return e2;
            }
        }
    }
}*/

        /*Sayisal sayisal1 = new Sayisal(30,40,20,30);

        Sayisal sayisal2 = new Sayisal(25,45,2,35);
        Sayisal birinci = birinci(sayisal1,sayisal2);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40,10,50,0);

        EsitAgirlik birinci2 = birinci (esitAgirlik1,esitAgirlik2);

        System.out.println("Birinci Sayılsal Öğrencinin Puanı: " + birinci.puanHesapla());
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı: " + birinci2.puanHesapla());*/





 /*Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] string_dizi = {"Java","Phyton","C++","Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"), new Ogrenci("Mehmet"), new Ogrenci ("Merve")};

        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);
    }
    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        }*/
