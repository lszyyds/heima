package myList;

import java.util.ArrayList;

public class LIstDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for(int i=0;i< array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        for(String s:array){
            System.out.println(s);
        }
    }
}
