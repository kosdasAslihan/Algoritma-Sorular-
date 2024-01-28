package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution8 {

    //Girilen bir x sayısının yine girilen bir y sayısına tam bölünüp bölünmediğini ekrana yazdıran algoritma

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sirasiyla x ve y sayilarini giriniz: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x % y == 0) {
            System.out.println("x sayisi y sayisina tam bolunuyor.");
        } else {
            System.out.println("x sayisi y sayisina tam bolunmuyor. Bolumden kalan: " + (x % y));

        }
    }
}
