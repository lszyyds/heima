package myCollections;
/*
案例需求
        通过程序实现斗地主过程中的洗牌，发牌和看牌
*/


import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现

        ArrayList<String> array =new ArrayList<String>();
        //定义花色数组
        System.out.println("下面有请刘先生(大帅比)发牌");
        String[] colors = {"♦", "♣", "♥", "♠"};
//定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

            for(String number:numbers){
                for(String color :colors){
                array.add(color+number);
            }
        }
        array.add("大王");
        array.add("小王");
        //洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        Collections.shuffle(array);
        ArrayList<String> tjsArray = new ArrayList<String>();
        ArrayList<String> wpyArray = new ArrayList<String>();
        ArrayList<String> cyfArray = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i=0;i<array.size();i++){
            String poker = array.get(i);
            if(i>=array.size()-3){
                dpArray.add(poker);
            }
            else if( i%3==0){
                tjsArray.add(poker);
            }
            else if(i%3==1){
                wpyArray.add(poker);

            }
            else if (i%3==2){
                cyfArray.add(poker);
            }
        }
        //看牌，也就是三个玩家分别遍历自己的牌
        lookPoker("田佳士", tjsArray);
        lookPoker("王培宇", wpyArray);
        lookPoker("魏盛冰", cyfArray);
        lookPoker("底牌", dpArray);}
        //看牌的方法
        public static void lookPoker(String name, ArrayList<String> array) {
            System.out.print(name + "的牌是：");
            for (String poker : array) {
                System.out.print(poker + " ");
            }
            System.out.println();



    }
}
