package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution20 {
    /*
    Girilen 3 basamaklı bir sayının basamaklarının küpleri toplamı sayının kendine eşit olup olmadığını
    bulan programın algoritması
     */
    public static void main(String[] args) {
        int toplam = 0;
        int bas,x;

        Scanner input = new Scanner(System.in);

        System.out.print("3 basamakli bir sayi giriniz: ");
        int sayi = input.nextInt();
        x = sayi;

        while (sayi > 9) {
            bas = sayi % 10;
            toplam = toplam + (bas * bas * bas);
            sayi = sayi / 10;
        }
        toplam = toplam + (sayi * sayi * sayi);
        if (toplam == x) {
            System.out.println("Esit");
        } else {
            System.out.println("Esit degil");
        }


    }
}

