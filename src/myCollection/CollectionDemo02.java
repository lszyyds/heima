package myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<String >();
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("world");
        System.out.println(c);



        c.remove("world");
        System.out.println(c);


    /*    c.clear();
        System.out.println(c);*/

        System.out.println(c.isEmpty());
        System.out.println(c);

        System.out.println(c.size());
        System.out.println(c);

    }
}
