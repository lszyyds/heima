package myCharStream;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
/*
        BufferedWriter bw =new BufferedWriter(new FileWriter("D:\\heima\\lszz.txt"));
        for (int i=0;i<10;i++){
            bw.write("hello"+i);
            //bw.write("\r\n");
          //  void newLine() 写一行行分隔符，行分隔符字符串由系统属性定义
            bw.newLine();
            bw.flush();

        }
        bw.close();
*/
        /*String readLine()
        读一行文字。 结果包含行的内容的字符串，不包括任何行终止字符如果流的结尾已经
        到达，则为null*/
        BufferedReader br =new BufferedReader(new FileReader("D:\\heima\\lszz.txt"));
  /*      String line = br.readLine();
        System.out.println(line);
*/
        String line ;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
