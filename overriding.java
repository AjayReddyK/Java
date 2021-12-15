class Super{
    public void display(){
        System.out.println("Super class display");
    }
}
class Sub extends Super{ 
    public void display(){
        System.out.println("sub class display");
    }
}
public class overriding {
    public static void main(String[] args) {
        //overiding
        Sub s=new Sub();
        s.display();
        //dynamic method dispatch
        Super k=new Sub();
        k.display();
        
    }
    
}
