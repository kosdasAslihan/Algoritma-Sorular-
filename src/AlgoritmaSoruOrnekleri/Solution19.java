package AlgoritmaSoruOrnekleri;


import java.util.Scanner;

public class Solution19 {

    //Girilen pozitif sayının kaç basamaklı olduğunu söyleyen program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sayi;
        int i = 1;
        System.out.println("Bir sayi giriniz");
        sayi = input.nextFloat();

        while(sayi>9){
            sayi = sayi /10;
            i++;
        }
        System.out.println("Sayi " + i + " basamakli");

    }


}
