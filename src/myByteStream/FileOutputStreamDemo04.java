package myByteStream;
/*异常处理格式
        try-catch-finally
        try{
            可能出现异常的代码;
            }catch(异常类名 变量名){
            异常的处理代码;
            }finally{
            执行所有清除操作;
            }
        finally特点
        被finally控制的语句一定会执行，除非JVM退出*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
//加入finally来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\heima\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
