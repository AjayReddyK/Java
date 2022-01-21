class test extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" Hello  ");
            i++;
            if(i==100){
                break;
            }            
        }
    }

}
public class thread1 {
  public static void main(String[] args){
        test m=new test();
        m.start();
        int i=0;
        while(true){
            System.out.println(i+" World ");
            i++;
            if(i==100){
                break;
            }
        }
  }  
}
