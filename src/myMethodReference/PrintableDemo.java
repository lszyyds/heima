package myMethodReference;

public class PrintableDemo {
    public static void main(String[] args) {
      // usePrintable(s ->System.out.println(s));
        //方法引用符 ::
        usePrintable(System.out::println);
       // usePrintable(System.out::println);
        //可推导的，就是可省略的

    }
    public static void usePrintable(Printable p){
        p.printString("爱Java");
       //p.printInt(666);

    }
}
