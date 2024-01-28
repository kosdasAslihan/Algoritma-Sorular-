package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution23 {
    //Girilen sayinin 5'in kuvveti olup olmadigini bulan programin algoritmasi

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        if(sayi % 5 == 0) {
            System.out.println("Sayi 5'in kuvvetidir");
        }
        else {
            System.out.println("Sayi 5'in kuvveti degildir");
        }
    }
}
