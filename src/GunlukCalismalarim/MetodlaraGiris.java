package GunlukCalismalarim;

import java.util.Scanner;

public class MetodlaraGiris {
    public static void selamlama () {
        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar...");
    }

    public static void faktoriyel (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        while (sayi>0) {
            faktoriyel *= sayi;
            sayi--;

        }
        System.out.println("Faktöriyel : " + faktoriyel);


    }

    public static void main(String[] args) {
        /*
        Erişim_Belirleyici (Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı (Parametreler) {
            // Burası Fonksiyon Bloğu

            // Fonksiyonun yapacağı işlemler burada olacak.


        }
         */

        //selamlama(); // yukarıda tanımladığımız fonksiyonu istediğimiz kadar çağırabiliyoruz

        //selamlama();

        faktoriyel();
        faktoriyel();










    }
}
