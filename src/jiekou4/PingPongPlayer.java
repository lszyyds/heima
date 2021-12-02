package jiekou4;

public class PingPongPlayer extends Player implements SpeakEnglish {
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃酱香饼");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
