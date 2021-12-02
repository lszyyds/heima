package mySystem;

public class SystemDemo {
    public static void main(String[] args) {
     /*   System.out.println("开始");
        System.exit(0);//public static void exit (int status);终止当前运行的Java虚拟机，非零表示异常终止
        System.out.println("结束");
*/
       // System.out.println(System.currentTimeMillis());

        long start =System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时"+(end -start)+"毫秒");
    }

}
