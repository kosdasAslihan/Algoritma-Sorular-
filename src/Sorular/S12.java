package Sorular;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        /*Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et
        Eğer number çift ise  print true
        Eğer number tek ise  print false
        result true ya da false olmalı.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Bir numara giriniz: ");
        int number = input.nextInt();

        String result = number % 2 == 0 ? "True" : "False";
        System.out.println(result);
    }
}
