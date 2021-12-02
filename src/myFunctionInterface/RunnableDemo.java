package myFunctionInterface;
//函数式接口作为方法的参数

public class RunnableDemo {

    public static void main(String[] args) {
        //在主方法中调用startThread方法
        //匿名内部类的方式
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });
        //Lambda方式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
    }



    private static void startThread(Runnable r){
//        Thread t=new Thread(r);
//        t.start();
        new Thread(r).start();

    }
}
