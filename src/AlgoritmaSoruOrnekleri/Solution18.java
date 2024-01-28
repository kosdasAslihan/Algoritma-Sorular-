package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {

        //Doğum tarihi girilen kişinin yaşını hesaplayan program

        Scanner input = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz");
        int dYili = input.nextInt();
        int yil = 2024;
        int yas = yil-dYili;
        System.out.println(yas);

    }
}
