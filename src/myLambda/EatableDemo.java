package myLambda;

public class EatableDemo {
    public static void main(String[] args) {
        //在主方法调用  useEatable 方法
        Eatable e = new EatableImpl();//
        useEatable(e);
        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("我爱你有种左灯右行的冲突");
            }
        });
        //Lambda表达式
        useEatable(()->{
            System.out.println("我爱你有种左灯右行的冲突");
        });

    }
        public static void useEatable(Eatable e){
            e.eat();
        }
    }
