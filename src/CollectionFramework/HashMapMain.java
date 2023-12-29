package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");
        //hashMap.put(20,"Php"); 2 kere göremiyoruz. Çünkü key ortak ve 1 key sadece 1 defa var olabiliyor.
        hashMap.put(50,"Javascript"); //php'yi siliyor ve javascript'i yazdırıyor.

       /* System.out.println(hashMap);

        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(10));
        //System.out.println(hashMap.get(100)); 100 değerine karşılık gelen herhangi bir değer olmadığı için null yazdırılır.*/

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()) {
            System.out.println("Anahtar: " + entry.getKey() + " ------> Değer: " + entry.getValue());
        }

    }
}
