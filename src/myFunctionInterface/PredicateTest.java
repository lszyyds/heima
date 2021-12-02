package myFunctionInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
                ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length()
                                > 2,
                        s -> Integer.parseInt(s.split(",")[1]) > 33);
        for (String str : array) {
            System.out.println(str);
        }
}
        //通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中
        private static ArrayList<String> myFilter(String[] strArray, Predicate<String>
                pre1, Predicate<String> pre2) {
//定义一个集合
            ArrayList<String> array = new ArrayList<String>();
//遍历数组
            for (String str : strArray) {
                if (pre1.and(pre2).test(str)) {
                    array.add(str);
                }
            }
            return array;
        }
    }