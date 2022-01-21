class Display{
    
    synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}

class thread1 extends Thread{
    Display d;
    public thread1(Display d){
        this.d=d;
    }
    public void run(){
        d.display("Hello guys ... ");
    }

}
class thread2 extends Thread{
    Display d;
    public thread2(Display data){
        this.d=data;
    }
    public void run(){
        d.display("welcome to India");
    }
}
public class synchronisation {
    public static void main(String[] args) {
        Display d=new Display();
        thread1 t=new thread1(d);
        thread2 m=new thread2(d);
        t.start();
        m.start();
    }
}
