public class variablelenargs {
    static void print(String ...str){
        for(String x:str){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        String[] s={"ajay","tarun","srikanth","pavan"};
        print(s);
        print("hello","world");
        print("bye");
    }
    
}
