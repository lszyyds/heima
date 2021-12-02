package myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {


        HashMap<String, Student> hm = new HashMap<String, Student>();
        Student s1 = new Student("刘少振", 19);
        Student s2 = new Student("田佳士", 20);
        Student s3 = new Student("陈一凡", 30);

        hm.put("ito1", s1);
        hm.put("it02", s2);
        hm.put("it03", s3);
        //方式1：键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," +
                    value.getAge());
        }
        System.out.println("--------");
//方式2：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," +
                    value.getAge());
        }
    }
}


