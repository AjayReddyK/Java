class myrun implements Runnable
{
    public void run(){

    }
}
class newthread extends Thread
{   newthread(String name){
        super(name);
        setPriority(MIN_PRIORITY+3);
        
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
public class threadmethods {
    public static void main(String[] args) {
        Thread t=new Thread(new myrun(),"hi");
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        newthread n=new newthread("hello");
        
        System.out.println(n.getName());
        System.out.println(n.getId());
        System.out.println(n.getPriority());
        System.out.println(n.getState());
        n.start();
        n.interrupt();
        System.out.println(n.getName());
        System.out.println(n.getId());
        System.out.println(n.getPriority());
        System.out.println(n.getState());

    }
}
