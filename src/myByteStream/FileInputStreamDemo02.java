package myByteStream;

import java.io.FileInputStream;
import java.io.IOException;

/*一次读一个字节数组的方法
public int read(byte[] b)：从输入流读取最多b.length个字节的数据
        返回的是读入缓冲区的总字节数,也就是实际的读取字节个数*/
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =  new FileInputStream("D:\\heima\\fos.txt");
        byte []bys=new byte[1024];//1024及其整数倍
        int len;
        while((len=fis.read(bys))!=-1){
            //String (byte[]bytes,int offset,int length)
            System.out.print(new String(bys,0,len));
            fis.close();

        }
    }
}
