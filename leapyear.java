import java.lang.*;
import java.util.*;
class leapyear{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.printf("enter the year:");
        n=s.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("it is leap year");
                }
                else{
                    System.out.println("not a leap year");
                }
            }
            else{
                System.out.println("it is leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}