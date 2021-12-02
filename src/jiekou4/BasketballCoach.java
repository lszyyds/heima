package jiekou4;

public class BasketballCoach extends Coach implements SpeakEnglish{
    public BasketballCoach() {

    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void teach() {
        System.out.println("篮球教练教运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃墨西哥卷");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
