package myInteger;

import java.lang.Integer;

public class IntegerDemo {
    public static void main(String[] args) {
      /*  Integer i1=new Integer(100);
        System.out.println(i1);
        Integer i2=new Integer("100");
        System.out.println(i2);
*/
        int num = 100;
        String s = "" + num;
        System.out.println(s);


        String s2 = String.valueOf(num);
        System.out.println(s2);


        String s3 = "100";
        Integer i = Integer.valueOf(s3);
        int x = i.intValue();
        System.out.println(x);


        int y = Integer.parseInt(s);
        System.out.println(y);


    }
}
