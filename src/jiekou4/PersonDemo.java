package jiekou4;

public class PersonDemo {
    public static void main(String[] args) {
        PingPongPlayer pp = new PingPongPlayer();
        pp = new PingPongPlayer("刘少振", 19);
        System.out.println(pp.getName() + "," + pp.getAge());
        pp.eat();
        pp.study();
        pp.speak();
    }

}
