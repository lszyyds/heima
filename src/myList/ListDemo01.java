package myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        System.out.println(list);
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
            list.set(2, "s");
            System.out.println(list);

            System.out.println(list.get(2));
            //遍历
            for (int q = 0; q < list.size(); q++) {
                String a = list.get(q);
                System.out.println(a);
            }
        }

    }
}