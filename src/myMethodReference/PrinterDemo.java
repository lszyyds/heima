package myMethodReference;
/*引用对象的实例方法，其实就引用类中的成员方法*/

public class PrinterDemo {
    public static void main(String[] args) {
        //Lambda简化写法
//        usePrinter((String s)->{
////            String result = s.toUpperCase();
////            System.out.println(result);
//            System.out.println(s.toUpperCase());
//        });
    usePrinter(s -> System.out.println(s.toUpperCase()));
    //引用对象的实例方法
    PrintString ps = new PrintString();
    usePrinter(ps::printUpper);
}//Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数

    private static void usePrinter(Printer p) {
        p.printUpperCase("HelloWorld");
    }
}
