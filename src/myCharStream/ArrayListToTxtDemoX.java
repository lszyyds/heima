package myCharStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemoX {
    public static void main(String[] args) throws IOException {
//创建ArrayList集合
        ArrayList<Student> array = new ArrayList<Student>();
//创建学生对象
        Student s1 = new Student("itheima001", "林青霞", 30, "西安");
        Student s2 = new Student("itheima002", "张曼玉", 35, "武汉");
        Student s3 = new Student("itheima003", "王祖贤", 33, "郑州");
//把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
//创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\heima\\students.txt"));
//遍历集合，得到每一个学生对象
        for (Student s : array) {
//把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
//调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
//释放资源
        bw.close();
    }
}