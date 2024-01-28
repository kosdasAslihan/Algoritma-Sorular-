package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution6 {

    //Girilen bir sayının tek mi çift mi olduğunu hesaplayan ve sonucu ekrana yazdıran algoritma

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Bu sayi cift sayidir");
        } else {
            System.out.println("Bu sayi tek sayidir");
        }

    }
}
