package mySet;
import java.util.TreeSet;
import java.util.Comparator;
/*案例需求
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现*/

public class TreeSetDemo04 {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student02> ts = new TreeSet<Student02>(new Comparator<Student02>(){

            @Override
            public int compare(Student02 s1, Student02 s2) {
// int num = (s2.getChinese()+s2.getMath())-(s1.getChinese()+s1.getMath());
//主要条件
                int num = s2.getSum() - s1.getSum();
//次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;


            }
        });

//创建学生对象
        Student02 s1 = new Student02("林青霞", 98, 100);
        Student02 s2 = new Student02("张曼玉", 95, 95);
        Student02 s3 = new Student02("王祖贤", 100, 93);
        Student02 s4 = new Student02("柳岩", 100, 97);
        Student02 s5 = new Student02("风清扬", 98, 98);
        Student02 s6 = new Student02("左冷禅", 97, 99);
// Student s7 = new Student("左冷禅", 97, 99);
        Student02 s7 = new Student02("赵云", 97, 99);
//把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
//遍历集合
        for (Student02 s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," +
                    s.getMath() + "," + s.getSum());
        }
    }
    }

