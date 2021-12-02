package myInterface;

public interface Inter {
    void show();
   public default void method(){
        System.out.println("Inter中的默认方法被调用了");
    }
    public static void test(){
        System.out.println("Inter中的静态方法被调用了");
    }
}
