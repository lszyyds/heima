package myFunctionInterface;
/*Consumer接口
        Consumer接口也被称为消费型接口，它消费的数据的数据类型由泛型指定*/
/*
方法名                                 说明
        void accept(T t) 对给定的参数执行此操作
default Consumer andThen(Consumer after)
        返回一个组合的Consumer，依次执行此操作，然后执行after操作

*/
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("刘少振",(String s)->{
            System.out.println("s");
        });
        //操作一
        operatorString("林青霞", s -> System.out.println(s));
      //  operatorString("林青霞", System.out::println);
        //操作二
        operatorString("林青霞", s -> System.out.println(new
                StringBuilder(s).reverse().toString()));
        System.out.println("--------");
        //传入两个操作使用andThen完成
        operatorString("林青霞", s -> System.out.println(s), s ->
                System.out.println(new StringBuilder(s).reverse().toString()));
    }
    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
        // con1.accept(name);
        // con2.accept(name);
        con1.andThen(con2).accept(name);
    }




    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
