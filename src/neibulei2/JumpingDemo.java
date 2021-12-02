package neibulei2;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo=new JumpingOperator();

        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");

            }
        });
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });
    }

}
