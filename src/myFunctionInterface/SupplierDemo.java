package myFunctionInterface;
/*
Supplier接口
        Supplier接口也被称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生产
        什么类型的数据供我们使用。
*/

/*方法名 说明
        T get() 按照某种实现逻辑(由Lambda表达式实现)返回一个数据*/
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "刘少振");
        System.out.println(s);
        Integer i= getInteger(()->10);
        System.out.println(i);


    }

    private static String getString(Supplier<String> sup) {
        return sup.get();

    }
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }
}