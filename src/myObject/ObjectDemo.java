package myObject;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("刘少振");
        s1.setAge(19);
       /* System.out.println(s);//myObject.Student@7f31245a
        System.out.println(s.toString())*/;
        Student s2=new Student();
        s2.setName("刘少振");
        s2.setAge(19);
       // System.out.println(s1==s2);//比较内容是否相同----false
        System.out.println(s1.equals(s2));//equals方法默认  Object里面的equals比较的是地址，所以要重写equals方法
    }

}
