package myCharStream;
/*方法名               说明
        flush() 刷新流，之后还可以继续写数据
        close() 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据*/

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建一个使用默认字符集的OutputStreamWriter
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\heima\\osw.txt"));
      /*  int by= 97;
        osw.write(by);
        osw.flush();
        osw.write(98);
        osw.close();*/
        //void writ(char[] cbuf)：写入一个字符数组
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
// osw.write(chs);
//void write(char[] cbuf, int off, int len)：写入字符数组的一部分
// osw.write(chs, 0, chs.length);
// osw.write(chs, 1, 3);
//void write(String str)：写一个字符串
// osw.write("abcde");
//void write(String str, int off, int len)：写一个字符串的一部分
// osw.write("abcde", 0, "abcde".length());
        osw.write("abcde", 1, 3);
        osw.close();


    }
}
