package myByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis =new FileInputStream("D:\\itcast\\MySQL.txt");
        //根据目的地创建字节输出流对象
        FileOutputStream fos =new FileOutputStream("D:\\heima\\MySQL.txt");
        //读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
