package myException02;

import java.util.Scanner;

public class TeacherDemo  {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();
        Teacher t= new Teacher();
        try {
            t.checkScore(score);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
