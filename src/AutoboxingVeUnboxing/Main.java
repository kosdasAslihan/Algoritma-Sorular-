package AutoboxingVeUnboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Wrapper Class
        boolean -> Boolean
        char -> Character
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
         */

        ArrayList<String> arrayList = new ArrayList<String>();

        //ArrayList<int> arrayList2 = new ArrayList<int>();

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        /*for (int i = 0; i < 10; i++) {
            arrayList2.add(Integer.valueOf(i*4)); //autoboxing
        }

        for (int i = 0; i < arrayList2.size() ; i++) {
            System.out.println(arrayList2.get(i).intValue()); //unboxing
        }*/

        for (int i = 0; i < 10; i++) {
            arrayList2.add(i*4); //Integer.valueOf(i*4)
        }

        for (int i = 0; i < arrayList2.size() ; i++) {
            System.out.println(arrayList2.get(i));//arraylist2.get(i).get(i).intValue()




    }
}
