import java.lang.*;
import java.util.*;
public class fooddelivery {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char food_type;
        int quantity;
        int distance;
        System.out.print("V for vegetarian else N for non vegetarian:");
        food_type=s.next().charAt(0);
        System.out.print("enter the quantity:");
        quantity=s.nextInt();
        System.out.print("enter the distance in km:");
        distance=s.nextInt();
        if((food_type!='N' && food_type!='V') || distance<=0 || quantity<=0){
            System.out.println("bill=-1");
        }
        else{
            int amount ;
            if (food_type=='N'){
                amount=15;
            }
            else{
                amount=12;
            }
            amount=amount*quantity;
            if(distance>3){
                distance=distance-3;
                if(distance>3){
                    amount=amount+3;
                    distance=distance-3;
                    amount=amount+distance*2;
                }
                else{
                    amount=amount+distance;
                }
            }
            System.out.println("bill ="+amount);
        }


    }
    
}
