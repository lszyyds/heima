package myLambda;

public class FlyableImpl implements Flyable{
    @Override
    public void fly(String s) {
        System.out.println(s);
    }
}
