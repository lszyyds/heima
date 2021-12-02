package myByteStream;
/*字节流写数据如何实现换行
        windows:\r\n
        linux:\n
        mac:\r
字节流写数据如何实现追加写入
        public FileOutputStream(String name,boolean append)
        创建文件输出流以指定的名称写入文件。如果第二个参数为true ，则字节将写入文件的末尾而不是开头*/


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
       // FileOutputStream fos=new FileOutputStream("D:\\heima\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\heima\\fos.txt",true);
        //写数据
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        //释放资源
        fos.close();

    }
}
