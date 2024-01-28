package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution25 {

    /*
    Girilen a ve b sayisi 50'den buyuk oldugunda c=a+b islemini yaoan
    degilse bu sayilar uygun degil yazdiran algoritma
     */
    public static void main(String[] args) {
        System.out.println("50'den buyuk 2 tamsayi giriniz: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c;

        if (a > 50 && b > 50) {
            c = a + b;
            System.out.println("Toplam: " + c);
        }else {
            System.out.println("Girdiginiz sayilar uygun degildir.");
        }
    }
}
