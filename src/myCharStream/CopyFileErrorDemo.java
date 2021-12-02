package myCharStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileErrorDemo {
    //JDK7的改进方案       复制文件的异常处理
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\heima\\dsb.txt");
             FileWriter fw = new FileWriter("D:\\heima\\dsb.txt");) {

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);

            }
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}