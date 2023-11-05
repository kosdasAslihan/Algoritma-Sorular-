package Calismalarim;

import java.util.Scanner;

public class ders01 {
    public static void main(String[] args) {
        //kullanicidan dikdörtgenin uzun kenar bilgisini ve kisa kenar bilgisini alıp
        //dikdörtgenin çevre ve alanını hesaplayın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dikdörtgenin uzun kenarını giriniz: ");
         int uzunKenar= scanner.nextInt();
        System.out.print("LÜtfen dikdörtgenin kısa kenarını giriniz: ");
        int kisaKenar= scanner.nextInt();

        int alan = kisaKenar*uzunKenar;
        int cevre = (kisaKenar*kisaKenar) + (uzunKenar*uzunKenar);

        System.out.println("Dikdörtgenin alanı : " + alan);
        System.out.println("Dikgörtgenin çevresi : " + cevre);



    }
}
