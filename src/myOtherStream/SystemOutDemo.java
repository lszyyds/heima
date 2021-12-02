package myOtherStream;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println();
        //能够方便地打印各种数据值
        // ps.print("hello");
        // ps.print(100);
        // ps.println("hello");
        // ps.println(100);
        //System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println(100);
        System.out.println();
        // System.out.print();

    }
}
