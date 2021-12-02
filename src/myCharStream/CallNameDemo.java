package myCharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("D:\\heima\\names"));
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();
        //调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line=br.readLine())!=null) {
        //把读取到的字符串数据存储到集合中
            array.add(line);
        }
        //释放资源
        br.close();
        //使用Random产生一个随机数,随机数的范围在：[0,集合的长度)
        Random r =new Random();
        int index = r.nextInt(array.size());
        //把第6步产生的随机数作为索引到ArrayList集合中获取值
        String s = array.get(index);
        //把第7步得到的数据输出在控制台
        System.out.println("抽到谁，陈一凡娶谁 : "+s);

    }
}
