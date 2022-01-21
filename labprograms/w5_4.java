package labprograms;
import java.util.*;
class Account{
    private double balance;
    private static int counter=1;
    final String name;
    final int acc_no;
    public String address;
    public Account(String name,String address, int balance){
        setbalance(balance);
        this.name=name;
        this.acc_no=counter;
        counter++;
        this.address=address;    
    }
    public void credit(int amount){
        balance+=amount;
        System.out.println("Current balance:"+balance);
    }
    public void debit(int amount){
        if(amount>balance){
            System.out.println("Debit amount exceeded account balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw successful");
        }
    }

    public void getbalance(){
        System.out.println("current balance:"+balance);
    }

    private void setbalance(int balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            balance=0;
        }
    }
    public void getdetails(){
        System.out.println("name:"+name+"\naccount number:"+acc_no+"\nbalance:"+balance+"\naddress:"+address);
    }

}
public class w5_4 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            Account my=new Account("Ajay","hyderabad",-12);
            int num;
            int b=1;
            while(b==1){
                System.out.print("choose\n1.getdetails\n2.getbalance\n3.credit\n4.debit\n5.exit\nchoose:");   
                int k=s.nextInt();
                switch(k){
                    case 1:
                        my.getdetails();
                        break;
                    case 2:
                        my.getbalance();
                        break;
                    case 3:
                        System.out.print("enter the amount to credit:");
                        num=s.nextInt();
                        my.credit(num);
                        break;
                    case 4:
                        System.out.print("enter the amount to withdraw:");
                        num=s.nextInt();
                        my.debit(num);
                        break;
                    case 5:
                        b=0;
                        break;
                    default:
                        System.out.println("enter valid option");          
                }
            }
        }
    }
}
