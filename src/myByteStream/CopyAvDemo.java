package myByteStream;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAvDemo {
    public static void main(String[] args) throws IOException{
        long startTime=System.currentTimeMillis();

        method4();
        long endTime=System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }



    /*public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\itcast\\lsz.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\heima\\lsz.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();*/
        /*public static void method2() throws IOException {
            FileInputStream fis = new FileInputStream("D:\\itcast\\lsz.mp4");
            FileOutputStream fos = new FileOutputStream("D:\\heima\\lsz.mp4");
           byte []bys =new byte[1024];
           int len;
           while((len=fis.read(bys))!=-1) {
               fos.write(bys,0,len);
           }

            fos.close();
            fis.close();*/
/*    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\itcast\lsz.mp4"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("D:\\heima\\lsz.mp4"));

        int by;

        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bos.close();
        bis.close();*/
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\itcast\\lsz.mp4"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("D:\\\\heima\\\\lsz.mp4"));

        byte[]bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }
}