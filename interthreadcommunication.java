class Shared{
    int value=0;
    boolean bool=true;
    synchronized void set(int k){
        while(bool!=true){
             try{wait();}catch(Exception e){}
        }
        value=k;
        bool=false;
        System.out.println("producer="+value);
        notify();
    }
    synchronized int get(){
        int x=0;
        while(bool!=false){
            try{wait();}catch(Exception e){}
        }
        x=value;
        bool=true;
        System.out.println("consumer="+value);
        notify();
        return x;
     }
        

}
class Producer extends Thread{
    Shared sh;
    int value=0;
    public Producer(Shared s){
        sh=s;
    }
    public void run(){
        while(true){
            value++;
            sh.set(value);
        }
    }
}
class Consumer extends Thread{
    Shared sh;
    int value;
    public Consumer(Shared s){
        sh=s;
    }
    public void run(){
        while(true){
            value=sh.get();
            
        }
    }
}
public class interthreadcommunication {
    public static void main(String[] args) {
        Shared s=new Shared();
        Producer p=new Producer(s);
        Consumer c=new Consumer(s);
        p.start();
        c.start();
    }
}
