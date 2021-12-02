package myException02;

public class Teacher {
    public void checkScore(int score) throws Exception{
        if (score<0||score>100){
        throw new ScoreException("分数错误");
        }else{
            System.out.println("分数正常");
        }

    }
}
