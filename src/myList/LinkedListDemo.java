package myList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>  link =new LinkedList<String>();
        link.add("hello");
        link.add("world");
        link.add("java");
       /* link.addFirst("javase");
        System.out.println(link);
        link.addLast("javaee");
        System.out.println(link);*/
//        System.out.println(link.getFirst());
//        System.out.println(link.getLast());
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println(link);

    }
}
