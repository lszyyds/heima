package mySet;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 =new Student("刘",19);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("--------");

        Student s2=new Student("刘",19);
        //默认情况下，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的

        System.out.println(s2.hashCode());
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());

        System.out.println("--------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}
