package myGeneric;

public class Generic<T> {
    public T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public <A>void show(A e){
        System.out.println(e);
    }

}
