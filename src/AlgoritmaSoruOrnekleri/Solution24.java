package AlgoritmaSoruOrnekleri;

public class Solution24 {
    //Fibonacci serisinin ilk 10 terimini ekrana basan algoritma

    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 1;
        int sayi3;
        int sayac;
        System.out.println(sayi1 + "");
        System.out.println(sayi2 + "");
        for(sayac = 3; sayac <= 10; sayac++){
            sayi3 = sayi1 + sayi2;
            System.out.println(sayi3 + "");
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
    }

}
