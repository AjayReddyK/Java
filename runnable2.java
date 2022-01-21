public class runnable2 implements Runnable{
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
    public static void main(String[] args) {
        runnable2 m=new runnable2();
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
