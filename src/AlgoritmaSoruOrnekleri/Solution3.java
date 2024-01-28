package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution3 {

    //1 ile 1000 arasındaki sayıları ekrana yazdıran algoritma
    static void SayilariYazdir(int sayi) {
        if (sayi > 0) {
            SayilariYazdir(sayi - 1);
            System.out.println(sayi + " ");
        }
    }

    public static void main(String[] args) {
        SayilariYazdir(1000);

        /*Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        SayilariYazdir(sayi);
        bu sekilde yazarsak sayiyi biz giriyoruz ve o sayiya kadar olan tum sayilari yazıyor
        */


    }

}
