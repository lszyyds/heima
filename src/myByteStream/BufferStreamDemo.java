package myByteStream;
/*
字节缓冲流介绍
        lBufferOutputStream：该类实现缓冲输出流。 通过设置这样的输出流，应用程序可以向底层输出流写
        入字节，而不必为写入的每个字节导致底层系统的调用
        lBufferedInputStream：创建BufferedInputStream将创建一个内部缓冲区数组。 当从流中读取或跳过
        字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
*/

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*构造方法
        BufferedOutputStream(OutputStream out) 创建字节缓冲输出流对象
        BufferedInputStream(InputStream in) 创建字节缓冲输入流对象*/


public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream fos =new FileOutputStream("D:\\heima\\bos.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos);
        fos.write("hello\r\n".getBytes());
        fos.write("world\r\n".getBytes());
        fos.close();*/
        FileInputStream fis =new FileInputStream("D:\\heima\\bos.txt");
        BufferedInputStream bis =new BufferedInputStream(fis);
        //一次读取一个字节数据
        // int by;
        // while ((by=bis.read())!=-1) {
        // System.out.print((char)by);
        // }
        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1) {
            System.out.print(new String(bys, 0, len));
        }
        bis.close();






    }
}
