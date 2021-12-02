package myCharStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\heima\\ConversionStreamDemo.java"));

        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\heima\\Copy.java"));
        //读写数据，复制文件
        //一次读写一个字符数据
      /*  int by;
        while((by= isr.read())!=-1){
            osw.write(by);

        }*/
        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1) {
            osw.write(chs,0,len);
        }
//释放资源
        osw.close();
        isr.close();


    }
}
/*
InputStreamReader 可以换成 FileReader
OutputStreamWriter  可以换成 FlieWriter
*/


