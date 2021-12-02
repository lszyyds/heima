package myNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
//Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号
        Socket s=new Socket("192.168.229.1",18757);
        //获取输出流，写数据
//OutputStream getOutputStream() 返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        //接受服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys =new byte[1024];
        int len = is.read(bys);
        String data =new String(bys,0,len);
        System.out.println("客户端 "+data);
        //释放资源
        is.close();
        os.close();
        s.close();

    }
}
