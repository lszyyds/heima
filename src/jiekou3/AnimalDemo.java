package jiekou3;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumping j=new Cat();
        j.jump();
        System.out.println("--------");

       Animal a =new Cat();
//        a.setName("加菲");
//        a.setAge(5);
//        System.out.println(a.getName()+","+a.getAge());
//        a.eat();
//        System.out.println("--------");

        a=new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        Cat c=new Cat();
         c=new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        c.eat();
        c.jump();






    }
}
