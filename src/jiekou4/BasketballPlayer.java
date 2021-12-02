package jiekou4;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃葱花饼");
    }
}
