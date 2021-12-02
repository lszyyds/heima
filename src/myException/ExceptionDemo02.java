package myException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {

        System.out.println("开始");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    //编译时异常
    public static void method() throws ParseException {
        String s = "2021-05-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);

    }


}

