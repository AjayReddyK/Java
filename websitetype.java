import java.util.*;
public class websitetype {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str=s.next();
            int index=str.lastIndexOf(".");
            switch(str.substring(index)){
                case ".com":
                    System.out.println("commercial website");
                    break;
                case ".org":
                    System.out.println("organisational website");
                    break;
                case ".biz":
                    System.out.println("business website");
                    break;
                default:
                    System.out.println("not a valid website");
                    break;
            }
        }
        
    }
}