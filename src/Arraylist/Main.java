package Arraylist;

import java.util.ArrayList;

public class Main {
    public static void yazdir(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element " + (i+1) + ": " +a.get(i));
        }
    }
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();


        arrayList.add("Metallica");
        arrayList.add("Guns 'n Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Megadeth");

        /*System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(3));*/

        /*System.out.println(arrayList.size()); //arraylistin boyunu almak için
        arrayList.remove("Metallica"); // 1 değeri kaldırmak için kullanılır ya da arrayList.remove(sayı)*/



        /*System.out.println(arrayList.indexOf("Metallica")); // bir elemanın yerini öğrenmek için, yukarıda 2 kere metallica
                                                            // yazıyor olsa da ilk gördüğünü alır

        System.out.println(arrayList.lastIndexOf("Metallica"));//lastIndexOf sondaki değerden başlar
        System.out.println(arrayList.indexOf("Dream Theater")); // böyle bir değer olmadığı için -1 değerini verir*/

        /*arrayList.set(4,"Megadeth"); //indexi verip yeni elementi oluşturacağız, bu şekilde arraylist güncellenmiş olur.



        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*/

        yazdir(arrayList);




    }
}
