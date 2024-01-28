package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {

        //Yarıçapı girilen dairenin çevresini ve alanını hesaplayan algoritma (pi sayısını 3.14 olarak alınız)

        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        double yariCap = scan.nextDouble();

        System.out.println("Dairenin Alanı: " + 3.14 * (yariCap * yariCap));
        //System.out.println("Dairenin Alanı: " + (Math.PI*(yariCap*yariCap))); math.pi java kütüphanesinde bulunmaktadır.
        //System.out.println("Dairenin Çevresi: " + 2 * Math.PI * yariCap);
        System.out.println("Dairenin Çevresi: " + 2 * 3.14 * yariCap);


    }

}
