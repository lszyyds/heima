package myOtherStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName) ：使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新
        // PrintWriter pw = new PrintWriter("D:\\heima\\pw.txt");
        // pw.write("hello");
        // pw.write("\r\n");
        // pw.flush();
        // pw.write("world");
        // pw.write("\r\n");
        // pw.flush();
        // pw.println("hello");
  /*
        pw.write("hello");
        pw.write("\r\n");
 */
        // pw.flush();
        // pw.println("world");
        // pw.flush();
        //PrintWriter(Writer out, boolean autoFlush)：创建一个新的PrintWriter
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\heima\\pw.txt"),true);
        // PrintWriter pw = new PrintWriter(newFileWriter("D:\\heima\\pw.txt"),false);
        pw.println("hello");
/*


        pw.write("hello");
        pw.write("\r\n");
        pw.flush();*/

        pw.println("world");
        pw.close();
    }

    }
