package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution22 {
    /*
    Kullanicinin girdigi 25 adet sayi icerisinden
    -negatif olanlarin toplamini
    -cift sayilarin toplamini
    -7'ye esit olanların adetlerini bulup
    console'a yazdirin.
     */
    public static void main(String[] args) {
        int negatif = 0;
        int cift = 1, i, sayi;
        int bolme = 0;
        Scanner input = new Scanner(System.in);
        for (i = 1; i <= 25; i++) {
            System.out.print(i + ".sayiyi giriniz: ");
            sayi = input.nextInt();
            if (sayi % 2 == 0) {
                cift *= sayi;
            }
            if (sayi < 0) {
                negatif += sayi;
            }
            if (sayi % 7 == 0) {
                bolme++;
            }
            System.out.println("Negatif sayilarin toplami: " + negatif);
            System.out.println("Cift sayilarin carpimi: " + cift);
            System.out.println("7'ye esit olanlarin adeti: " + bolme);
        }

    }
}
