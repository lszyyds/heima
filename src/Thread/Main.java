package Thread;

/**
 * @author lsz
 * @date 2021/9/24 13:14
 */


import java.util.Scanner;

/*
 任意输入1个正整数，利用Thread类的多线程方法计算该数的阶乘并输出。
 如:输入5，计算阶乘1*2*3*4*5后输出：120.
 */
class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("输入1个正整数:");
        long s1 = input.nextLong();
        //TODO：通过Thread定义一个线程，通过构造方法将参数传递过去，再通过多线程计算该数值的阶乘后输出
        ThreadTest t1 = new ThreadTest(s1);
        t1.start();
    }
}

class ThreadTest extends Thread {
    private long num;

    public ThreadTest(long num) {
        this.num = num;
    }

    @Override
    public void run() {

        //TODO：计算num的阶乘。
        long result=1;
        for(long i=1;i<=num;i++){
            result *= i;
        }

        System.out.print(result);

    }
}