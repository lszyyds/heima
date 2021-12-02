package myThread;

public class myThread extends Thread{
    public myThread(){}
    public myThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
