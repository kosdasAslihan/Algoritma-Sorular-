package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<String>();

        List<String> list = new ArrayList<String>();

        //Eleman Ekleme
        list.add("Java");
        list.add("Python");
        list.add("C++");

        //System.out.println(list.get(0));
        //System.out.println(list.get(2));
        //System.out.println(list.get(4)); //4. indeks olmadığı için hata verir.

        System.out.println("********************************");
        for(int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        System.out.println("********************************");

        for(String s : list) {
            System.out.println(s);
        }
        System.out.println("********************************");

        list.remove(1); //direkt index'in değerini verip "Java" şeklinde de yazabiliriz.
        for (String s: list) {
            System.out.println(s);
        }




    }
}
