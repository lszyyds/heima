package myMethodReference;
/*引用类方法，其实就是引用类的静态方法*/

public class ConverterDemo {
    public static void main(String[] args) {
//Lambda写法
        useConverter((String s)->{
            return Integer.parseInt(s);
        });
        useConverter(s -> Integer.parseInt(s));

//引用类方法
        useConverter(Integer::parseInt);
    }//Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
