package mySet;

import java.util.Random;
import java.util.TreeSet;



public class SetDemo02 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        Random r=new Random();
        while(set.size()<10){
            int i= r.nextInt(20)+1;
            set.add(i);
        }
for(Integer i: set){
    System.out.println(i);
}
    }
}
