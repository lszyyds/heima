package myCharStream;

import java.io.*;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
//根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new
                FileReader("D:\\heima\\ConversionStreamDemo.java"));
//根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new
                FileWriter("D:\\heima\\Copy.java"));
//读写数据，复制文件
//使用字符缓冲流特有功能实现
        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//释放资源
        bw.close();
        br.close();
    }
}

