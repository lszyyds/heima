package myLambda;

public class LambdaDemo {
    public static void main(String[] args) {
      /*  new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");}
        }).start();*/

       new Thread(()->{
            System.out.println("多线程程序启动了");
        }).start();
    }
}
