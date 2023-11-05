package Calismalarim;

import java.util.Scanner;

public class ders02 {
    public static void main(String[] args) {
        //Kullanicidan gun numarasini isteyin, gun numarasina göre gun isimlerini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gün numarasını giriniz : ");

         byte day = scanner.nextByte();

         if (day == 1) {
             System.out.println("Pazartesi");
         }
         else if (day == 2) {
             System.out.println("Salı");
         }
         else if (day == 3) {
             System.out.println("Çarşamba");
         }
         else if (day == 4) {
             System.out.println("Perşmebe");
         }
         else if (day == 5) {
             System.out.println("Cuma");
         }
         else if (day == 6) {
             System.out.println("Cumartesi");
         }
         else if (day == 7) {
             System.out.println("Pazar");
         }
         else {
             System.out.println("Geçersiz");
         }


    }
}
