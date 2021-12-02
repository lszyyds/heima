package myCharStream;
/*
相关方法    方法名                      说明
        byte[] getBytes() 使用平台的默认字符集将该 String编码为一系列字节
        byte[] getBytes(String charsetName) 使用指定的字符集将该 String编码为一系列字节    编码



        String(byte[] bytes) 使用平台的默认字符集解码指定的字节数组来创建字符串String
        String(byte[] bytes, String charsetName) 通过指定的字符集解码指定的字节数组来创建字符串String    解码
*/

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s ="刘少振";
        //byte[] bys = s.getBytes();
      byte[] bys = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys));




       // String ss=new String(bys);
        //String ss=new String(bys,"UTF-8");
        String ss=new String(bys,"GBK");
        System.out.println(ss);



    }
}
