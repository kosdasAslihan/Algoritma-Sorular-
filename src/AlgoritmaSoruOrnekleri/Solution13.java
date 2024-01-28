package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution13 {

    //İki dik kenarı girilen dik üçgenin hipotenüsünü hesaplayan algoritma
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin 2 dik kenarini giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();

        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.print("Ucgenin hipotenusu: " + hipotenus);
    }
}
