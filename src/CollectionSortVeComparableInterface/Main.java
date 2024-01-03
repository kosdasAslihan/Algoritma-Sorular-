package CollectionSortVeComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class BuyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);

    }
}


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list,new BuyuktenKucugeString());

        for (String s : list) {
            System.out.println(s);
        }

    }
}

