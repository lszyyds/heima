package myFunctionInterface;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        //定义一个int数组
        int [] arr={19,23,45,34,20};
       int maxValue= getMax(()->{
            int max=arr[0];
            for(int i=0;i< arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;

        });
        System.out.println(maxValue);

    }
    //返回一个int数组中的最大值
    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

}
