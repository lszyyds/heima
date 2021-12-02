package myByteStream;
/*
FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream ，该文件由文
        件系统中的路径名name命名
*/


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("D:\\heima\\fos.txt");
       /* int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);*/
        int by ;
        /*
        fis.read()：读数据
        by=fis.read()：把读取到的数据赋值给by
        by != -1：判断读取到的数据是否是-1
        */
        while((by= fis.read())!=-1){
            System.out.print((char)by);

        }



        fis.close();
    }
}
