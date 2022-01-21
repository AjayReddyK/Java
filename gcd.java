import java.util.Scanner;

public class gcd {
    static int gacd(int a,int b){
        int i;
        for(i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return i;
    }
    static int max(int ...A){
        int max=0;
        for(int x:A){
            if(x>max){
                max=x;
            }
        }
        return max;

    }
    static int min(int ...A){
        int min=100000;
        for(int x:A){
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a,b,result;
        Scanner s=new Scanner(System.in);
        System.out.print("enter a:");
        a=s.nextInt();
        System.out.print("enter b:");
        b=s.nextInt();
        result=gacd(min(a,b),max(a,b));
        System.out.println(result);
        s.close();
    }
}
