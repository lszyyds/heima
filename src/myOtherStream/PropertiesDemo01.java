package myOtherStream;

import java.util.Properties;
import java.util.Set;

/**
 * @author 刘少振
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
// Properties<String,String> prop = new Properties<String,String>(); //错误
        Properties prop = new Properties();//不是泛型类
    //存储元素
        prop.put("itheima001", "刘少振");
        prop.put("itheima002", "田佳士");
        prop.put("itheima003", "陈一凡");
    //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }
}
