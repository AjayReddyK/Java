import java.util.*;
public class stringsort {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n;
            System.out.print("enter number of strings:");
            n=s.nextInt();
            String arr[]=new String[n];
            s.nextLine();
            for(int i=0;i<n;i++){
                System.out.print("enter the string:");
                arr[i]=s.nextLine();
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+"  ");
            }
        }

    }
    
}
