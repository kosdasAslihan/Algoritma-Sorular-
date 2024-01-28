package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution7 {

    //Girilen bir sayının mutlak değerini hesaplayan ve sonucu ekrana yazdıran algoritma

    public static void main(String[] args) {
        //1.yol:
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int a = input.nextInt();
        a = Math.abs(a);
        System.out.println(a);

        //2.yol:
        System.out.print("Bir sayi giriniz: ");
        int b = input.nextInt();
        if (b < 0) {
            System.out.println(b * (-1));

        } else {
            System.out.println(b);
        }


    }
}
