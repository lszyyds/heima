package myCharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemoX {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("D:\\heima\\students.txt"));
        ArrayList<Student>  array=new ArrayList<>();
        String line ;
        while((line=br.readLine())!=null){
            String[] stuArray = line.split(",");
            Student s =new Student();
            s.setSid(stuArray[0]);
            s.setName(stuArray[1]);
            s.setAge(Integer.parseInt(stuArray[2]));
            s.setAddress(stuArray[3]);
            array.add(s);

        }
        br.close();
        for(Student s:array){
            System.out.println(s.getSid() + "," + s.getName() + "," +
                    s.getAge() + "," + s.getAddress());
        }


    }
}
