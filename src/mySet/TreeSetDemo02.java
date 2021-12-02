package mySet;
import java.util.TreeSet;
/*
    案例需求
        存储学生对象并遍历，创建TreeSet集合使用无参构造方法
        要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
    实现步骤
        用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
        自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
        重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
*/

public class TreeSetDemo02 {
    public static void main(String[] args) {
//创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();
//创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        Student s5 = new Student("linqingxia",33);
        Student s6 = new Student("linqingxia",33);
//把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
//遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}