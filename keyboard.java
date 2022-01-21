import java.util.*;

class keyboard{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a,b,c;
            System.out.println("enter two numbers:");
            a=s.nextInt();
            b=s.nextInt();
            c=a+b;
            System.out.println("sum is "+c);
            String name;
            System.out.println("enter your name:");
            name=s.nextLine();
            System.out.println("your name is"+name);
        }

    }
}