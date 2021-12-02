package myLambda;

public class AddableDemo {
    public static void main(String[] args) {
     /* useAddable((int a,int b)->{
          //return a-b;
          return a+b;
      });*/
        //参数的类型可以省略，省略应全省略
        useAddable(( a, b)->{
            //return a-b;
            return a+b;
        });
        //如果代码块的语句只有一条，可以省略大括号和分号，如果有return，return也要省略掉
        useAddable((a, b) -> a + b);


    }
    public static void useAddable(Addable a){
        int sum = a.add(1, 3);
        System.out.println(sum);

    }
}
