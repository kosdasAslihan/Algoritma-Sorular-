package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution1 {
    /*
    Bir öğrencinin almış olduğu vize notu ile final notunun ortalamasını hesaplayan algoritma
    (Vize notunun %30’unu final notunun %70’ini alarak hesaplama yapınız)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vize notunu giriniz: ");
        double vizeNotu = input.nextDouble();
        System.out.print("Final notunuz giriniz: ");
        double finalNotu = input.nextDouble();

        double ortalama = (0.3 * vizeNotu) + (0.7 * finalNotu);
        System.out.print("Vize ve Final Notunuzun Ortalaması: " + ortalama);


    }
}
