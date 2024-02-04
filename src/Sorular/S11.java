package Sorular;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
            /*
           Eğer age 10 dan küçük veya eşit ise
           facebook hesabi acmak icin cok gencsin print yapın.

           Eğer age 16 dan küçük veya eşit ise
           ehliyet almak icin cok gencsin print yapın.

           Eğer age 18 den küçük veya eşit ise
           dovme yaptirmak icin cok gencsin print yapın.

           Eğer age 21 den küçük veya eşit ise
           alkol icmek icin cok gencsin print yapın.

           Eğer age 21 den büyük ise
           istedigini yapabilirsin print yapın.
             */

        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int age = input.nextInt();

        if (age <= 10){
            System.out.println("Facebook hesabi acmak icin cok gencsin");
        } else if (age <= 16) {
            System.out.println("Ehliyet almak icin cok gencsin");
        } else if (age <= 18) {
            System.out.println("Dovme yaptirmak icin cok gencsin");
        } else if (age <= 21) {
            System.out.println("Alkol icmek icin cok gencsin");
        } else if (age > 21) {
            System.out.println("Istedigini yapabilirsin");
        }else {
            return;
        }
    }
}
