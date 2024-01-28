package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution4 {

    // Girilen pozitif bir tamsayının faktöriyelini hesaplayan algoritma
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
