package myFunctionInterface;
/*方法名 说明
        boolean test(T t) 对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
default Predicate negate() 返回一个逻辑的否定，对应逻辑非

;*/

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld",s -> s.length() > 8);
        System.out.println(b2);
    }
    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
// return !pre.test(s);
        return pre.negate().test(s);


    }

}
