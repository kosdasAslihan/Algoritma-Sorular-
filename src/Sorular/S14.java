package Sorular;

import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
        o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        3 basamaklı degilse çift olup olmadigini kontrol edin.
        Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”*/

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayi giriniz: ");
        int tamSayi = input.nextInt();

        String result = (tamSayi > 99 && tamSayi < 1000) ? "3 Basamakli" :
                (tamSayi % 2 == 0) ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi";
        System.out.println(result);
    }
}
