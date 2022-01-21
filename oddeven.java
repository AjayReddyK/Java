import java.util.*;
class oddeven {
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int n;
            System.out.println("enter the number:");
            n=s.nextInt();
            if(n%2==0){
                System.out.println(n+" is even number");
            }
            else{
                System.out.println(n+" is odd number");
            }
        }
    }    
}
