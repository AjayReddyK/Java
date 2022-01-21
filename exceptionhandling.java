public class exceptionhandling{
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("bye");
        }
    }
}