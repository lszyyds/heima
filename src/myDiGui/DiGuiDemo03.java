package myDiGui;


import java.io.File;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        //根据给定的路径创建一个File对象
        File srcFile = new File("D:\\JAVA");
        //调用方法
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fireArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if (fireArray != null) {
            for (File file : fireArray) {
                //判断该File对象是否是目录
                if (file.isDirectory()) {
                    //是：递归调用
                    getAllFilePath(file);
                } else {
                    //不是：获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
