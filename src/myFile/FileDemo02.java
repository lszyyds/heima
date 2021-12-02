package myFile;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在D:\\itcast目录下创建一个文件java.txt

        File f1 =new File("D:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");
        //需求2：我要在D:\\itcast目录下创建一个目录Javaee
        File f2 =new File("D:\\itcast\\javase");
        System.out.println(f2.mkdir());
        System.out.println("--------");
        //需求3：我要在D:\\itcast目录下创建一个多级目录JavaWeb\\HTML
        File f3 =new File("D:\\itcast\\javaWeb\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("--------");
        //需求4：我要在D:\\itcast目录下创建一个文件javase.txt
        File f4 =new File("D:\\itcast\\javase.txt");
        //System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
    }
}
