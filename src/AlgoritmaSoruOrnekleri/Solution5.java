package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution5 {

    //1’den N’e kadar olan tamsayıların toplamını hesaplayan algoritma
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int N = scanner.nextInt();
        int toplam = 0;

        for (int i = 0; i <= N; i++) {

            toplam += i;
        }
        System.out.println("Toplam : " + toplam);
    }

}
