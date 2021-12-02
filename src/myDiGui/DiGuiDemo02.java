package myDiGui;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println("5的阶乘是: "+result);
    }

    //定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    public static int jc(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * jc(n - 1);
        }
    }

}
