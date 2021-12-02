package mySet;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set =new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        for(String s:set){
            System.out.println(s);
        }

    }
}
//hashset对迭代顺序不做保证