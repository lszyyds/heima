package jiekou4;

public class PingPongCoach extends Coach {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃烤肉拌饭");
    }
}


