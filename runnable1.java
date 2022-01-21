class test implements Runnable{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" hello");
            if(i==1000){
                break;
            }
            i++;
        }
    }
}
public class runnable1 {
    public static void main(String[] args) {
        test m=new test();
        Thread t=new Thread(m);
        t.start();
        int i=0;
        while(true){
            System.out.println(i+" world");
            if(i==1000){
                break;
            }
            i++;
        }
    }
}
