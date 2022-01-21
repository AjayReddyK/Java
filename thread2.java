public class thread2 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" hello ");
            if(i==1000){
                break;
            }
            i++;
        }
    }
    public static void main(String[] args){
        thread2 m=new thread2();
        m.start();
        int i=0;
        while(true){
            System.out.println(i+" World");
            if(i==1000){
                break;
            }
            i++;
        }
    }
    
}
