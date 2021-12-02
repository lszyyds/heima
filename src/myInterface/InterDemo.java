package myInterface;

public class InterDemo {
    public static void main(String[] args) {
        Inter i =new InterImpl();
        i.show();
        i.method();
        Inter.test();//接口中的静态方法，只能通过接口名来调用,不能通过实现类名或者对象名调用
    }
}
