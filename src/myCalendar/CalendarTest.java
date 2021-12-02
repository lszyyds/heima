package myCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
//键盘录入任意的年份
       Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();

//设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

//3月1日往前推一天，就是2月的最后一天
       c.add(Calendar.DATE ,-1);
//获取这一天输出即可
        int i = c.get(Calendar.DATE);
        System.out.println(i);

    }

}