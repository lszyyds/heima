package myThread;

public class myThreadDemo {
    public static void main(String[] args) {
     /*   //void setName(String name)：将此线程的名称更改为等于参数 name
       // mt1.setName("高铁");
       // mt2.setName("飞机");
        myThread mt1=new myThread("飞机") ;
        myThread mt2=new myThread("火车") ;
        //void setName(String name)：将此线程的名称更改为等于参数 name
        // mt1.setName("高铁");
        // mt2.setName("飞机");
        // mt1.run();
        // mt2.run();
        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法

        mt1.start();
        mt2.start();
        //static Thread currentThread() 返回对当前正在执行的线程对象的引用*/
        System.out.println(Thread.currentThread().getName());

    }
}
