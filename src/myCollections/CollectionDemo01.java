package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(30);
        list.add(46);
        list.add(21);
        list.add(67);
        list.add(53);
        //public static <T extends Comparable<? super T>> void sort•(List<T>list)：将指定的列表按升序排序
//        Collections.sort(list);
        //public static void reverse•(List<?> list)：反转指定列表中元素的顺序
//Collections.reverse(list);
        //public static void shuffle•(List<?> list)：使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);

    }
    }
