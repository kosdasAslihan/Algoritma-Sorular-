package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution9 {

    //1’den N’e kadar olan tek tamsayıların toplamını hesaplayan algoritma

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int N = input.nextInt();
        int toplam = 0;

        for (int i = 0; i <= N; i++) {
            if (i % 2 != 0) {
                toplam += i;
            }
        }
        System.out.println("Tek sayilarin toplami: " + toplam);
    }

}
