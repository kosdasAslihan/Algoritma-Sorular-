package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution11 {

    // Kısa kenarı ve uzun kenarı girilen dikdörtgenin çevresini hesaplayan algoritma
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdortgenin kisa kenarini giriniz: ");
        int kisaKenar = input.nextInt();

        System.out.print("Dikdortgenin uzun kenarini giriniz: ");
        int uzunKenar = input.nextInt();

        int dikdortgenCevresi = 2 * (kisaKenar + uzunKenar);
        //int dikdortgenCevresi = ((kisaKenar+kisaKenar) + (uzunKenar+uzunKenar)); şeklinde de hesaplanir.

        if (uzunKenar <= kisaKenar) {
            System.out.println("Uzun kenar kisa kenardan kisa veya esit olamaz.");
        } else {
            System.out.print("Dikdortgenin cevresi: " + dikdortgenCevresi);
        }

    }
}
