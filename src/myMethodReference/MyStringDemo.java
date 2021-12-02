package myMethodReference;

public class MyStringDemo {
    public static void main(String[] args) {

        useMyString((s, x, y) -> s.substring(x, y));


        //引用类的实例方法
        useMyString(String::substring);
    }//Lambda表达式被类的实例方法替代的时候 第一个参数作为调用者 后面的参数全部传递给该方法作为参数
    public  static  void useMyString(MyString my){
        String s = my.mySubString("helloworld", 1, 5);
        System.out.println(s);
    }
}
