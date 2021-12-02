package myOtherStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args)throws IOException {
        PrintStream ps =new PrintStream("D:\\heima\\ps.txt");
        //写数据
        //字节输出流有的方法
        // ps.write(97);
        //使用特有方法写数据
        // ps.print(97);
        // ps.println();
        // ps.print(98);
        ps.println(97);
        ps.println(98);
//释放资源
        ps.close();


    }
}
