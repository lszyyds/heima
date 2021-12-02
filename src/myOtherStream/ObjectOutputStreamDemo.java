package myOtherStream;
import myObject.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\heima\\oos.txt"));
//创建对象
        Student s = new Student("刘少振",19);
//void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        oos.writeObject(s);
//释放资源
        oos.close();
    }
}
