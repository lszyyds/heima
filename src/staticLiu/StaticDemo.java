package staticLiu;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university="中原工学院";
        Student s1=new Student();
        s1.name ="刘少振";
        s1.age =19;

//        s1.university="中原工学院";
        s1.show();
        Student s2=new Student();
        s2.name ="王二小";
        s2.age =19;
        s2.show();

       // s2.university="中原工学院";


    }
}
