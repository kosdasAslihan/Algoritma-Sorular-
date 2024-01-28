package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution12 {

    //Girilen bir fiyatın KDV (%18) eklendikten sonraki KDV’li fiyatını ekrana yazdıran algoritma
    public static void main(String[] args) {
        int fiyat = 15;
        System.out.println("Fiyatin KDV'siz hali: " + fiyat);
        double kdvFiyat = (fiyat * 1.18);
        System.out.println("Fiyatin KDV'li hali: " + kdvFiyat);

    }
}
