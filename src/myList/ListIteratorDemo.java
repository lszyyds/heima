package myList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        ListIterator<String> l = list.listIterator();
        while(l.hasNext()){
            String s = l.next();
           if(s.equals("world")){
               l.add("javaee");
           }
        }
        System.out.println(list);

    }

}
