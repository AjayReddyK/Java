class another extends Thread{
    public void run(){
        int count=1;
        while(true)
        {
            System.out.println(count+++" created thread");
        }
    }
}
public class threadmethods2 {
    private static final int MIN_PRIORITY = 0;

    public static void main(String[] args) {
        another t=new another();
        t.setDaemon(true);
        //t.setPriority(MIN_PRIORITY+8);
        t.start();
        //try{Thread.sleep(100);}catch(Exception e){}; //sleep
        //Thread mainthread=Thread.currentThread();
        //try{mainthread.join();}catch(Exception e){}; //join

        int i=0;
        while(true){
            System.out.println(i++ +"main thread");
            Thread.yield();
        }
    }
}
