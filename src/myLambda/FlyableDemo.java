package myLambda;

public class FlyableDemo {
    public static void main(String[] args) {

      /*  Flyable f =new FlyableImpl();
        useFlyable(f);*/





        /*//匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);

            }
        });*/
        //Lambda表达式
        useFlyable((String s)->{
            System.out.println(s);

        });
        //参数的类型可以省略
        useFlyable((s)->{
            System.out.println(s);

        });
        //如果参数有且仅有一个，那么小括号可以省略
        useFlyable(s -> {
         System.out.println(s);
        });
        //如果代码块的语句只有一条，可以省略大括号和分号
        useFlyable(s -> System.out.println(s));



    }
    public  static void useFlyable(Flyable f){
        f.fly("⭐");
    }
}
