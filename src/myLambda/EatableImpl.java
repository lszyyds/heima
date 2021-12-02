package myLambda;


//调用一个方法，如果是接口，其实是要的它的实例化对象
public class EatableImpl implements Eatable{
    @Override
    public void eat() {
        System.out.println("我爱你有种左灯右行的冲突");
    }
}
