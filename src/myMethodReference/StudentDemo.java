package myMethodReference;
import myMap.Student;
//引用构造器，其实就是引用构造方法


public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder((String name, int age) -> {
            {
                // Student s=new Student( name, age);
                return new Student(name, age);
            }
        });
        //Lambda简化写法
        useStudentBuilder((name, age) -> new Student(name, age));



    //引用构造器
    useStudentBuilder(Student::new);

}//Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("刘少振", 19);
        System.out.println(s.getName() + "," + s.getAge());
    }
}