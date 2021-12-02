package myGeneric;

public class GenericDemo01 {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.setT("刘少振");
        System.out.println(g1.getT());

        Generic <Integer> g2 = new Generic<Integer>();
        g2.setT(19);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());



    }
}
