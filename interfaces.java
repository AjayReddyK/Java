interface Test{
    void meth1();
    void meth2();
}
class myclass implements Test{
    public void meth1(){
        System.out.println("method 1 implemented");
    }

    @Override
    public void meth2() {
        System.out.println("method 2 executed");
    }
}

public class interfaces {
    public static void main(String[] args) {
        myclass my=new myclass();
        my.meth1();
        my.meth2();   
    }   
}
