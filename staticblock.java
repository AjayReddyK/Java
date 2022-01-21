class rec{
    static{
        System.out.println("loaded class");
    }
    rec(){
         System.out.println("constructer");
    }
}

public class staticblock {
    public static void main(String[] args) {
        rec a=new rec();
        rec b=new rec();
    }
}
