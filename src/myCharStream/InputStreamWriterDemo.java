package myCharStream;
import java.io.*;

public class InputStreamWriterDemo {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr =new InputStreamReader(new FileInputStream("D:\\heima\\osw.txt"));
        //int read()：一次读一个字符数据
        /*int by;
        while ((by=isr.read())!=-1){
            System.out.print((char)by);
        }
        isr.close();*/
        //int read(char[] cbuf)：一次读一个字符数组数据
        char[]bys =new char[1024];
        int len;
        while((len=isr.read())!=-1){
            System.out.println(new String(bys,0, len));

        }
        isr.close();

    }
}
