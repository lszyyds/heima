package myLambda.lianXi;

/**
 * @author lsz
 * @date 2021/10/16 11:32
 */
public class TestLambda1 {
    //3.静态内部类
   static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("我是lambda02");
        }
    }



    public static void main(String[] args) {
        Ilike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();
        //4.局部内部类
        class Like3 implements Ilike{
            @Override
            public void lambda() {
                System.out.println("我是lambda03");
            }
        }
        like= new Like3();
        like.lambda();
        //5.匿名内部类     没有类的名称，必须借助接口或父类
          like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("我是lambda04");
            }
        };
        like.lambda();
        //6.Lambda表达式
        like=()-> {
            System.out.println("我是lambda05");
        };
        like.lambda();








    }
}
//1.定义一个函数式接口
interface Ilike{
    void lambda();
}
//2.实现类
class Like implements Ilike{
    @Override
    public void lambda() {
        System.out.println("我是lambda01");
    }
}

