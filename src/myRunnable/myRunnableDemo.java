package myRunnable;

public class myRunnableDemo {
    public static void main(String[] args) {
        myRunnable my =new myRunnable();
        //创建Thread类的对象，把MyRunnable对象作为构造方法的参数
//Thread(Runnable target)
// Thread t1 = new Thread(my);
// Thread t2 = new Thread(my);
//Thread(Runnable target, String name)
        Thread t1 = new Thread(my,"高铁");
        Thread t2 = new Thread(my,"飞机");
//启动线程
        t1.start();
        t2.start();
    }
}
