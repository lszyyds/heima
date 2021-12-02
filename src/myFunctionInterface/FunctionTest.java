package myFunctionInterface;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "刘少振,19";
        convert(s, ss -> s.split(",")[1], ss -> Integer.parseInt(ss), i -> i + 70);
        convert(s, ss -> s.split(",")[1], Integer::parseInt, i -> i + 70);
    }

    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2,
                                Function<Integer, Integer> fun3) {
        // Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);

    }
}
