package myCharStream;
/*字符流中和编码解码问题相关的两个类
        InputStreamReader：是从字节流到字符流的桥梁
        它读取字节，并使用指定的编码将其解码为字符
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
        OutputStreamWriter：是从字符流到字节流的桥梁
        是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集*/


import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//OutputStreamWriter osw = new OutputStreamWriter(newFileOutputStream("D:\\heima\\lc.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\heima\\lc.txt"));
        osw.write("中国");
        osw.close();
//InputStreamReader isr = new InputStreamReader(newFileInputStream("D:\\heima\\lc.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\heima\\lc.txt"));
//一次读取一个字符数据
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.print((char)ch);
        }
        isr.close();

    }
}