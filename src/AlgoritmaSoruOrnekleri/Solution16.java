package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution16 {

    //Klavyeden girilen bir sayının negatif, pozitif veya 0 olup olmadığını bulan programın algoritma

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        if (sayi < 0) {
            System.out.println("Girilen sayi negatiftir.");
        }
        else if (sayi == 0) {
            System.out.println("Girilen sayi 0'dir.");
        }
        else {
            System.out.println("Girilen sayi pozitiftir.");
        }

    }
}
