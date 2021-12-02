package mySet;


import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<Student> h = new HashSet<Student>();
        Student s1 = new Student("刘", 12);
        Student s2 = new Student("张", 13);
        Student s3 = new Student("李", 14);
        Student s4 = new Student("李", 14);
        h.add(s1);
        h.add(s2);
        h.add(s3);
        h.add(s4);
        for (Student s : h) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
