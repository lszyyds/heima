package myThread;

/**
 * @author lsz
 * @date 2021/11/6 9:45
 */
public class demo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }

    public static void main(String[] args) {
        demo t1=new demo();
        demo t2 =new demo();
        t1.setName("线程1");
        t2.setName("线程2");
        System.out.println(t1.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
