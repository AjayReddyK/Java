abstract class shape{
    abstract public int area();
    abstract public int perimeter();
}
class rectangle extends shape{
    public int length;
    public int breadth;
    public int area(){
        return this.length*this.breadth;
    }
    public int perimeter(){
        return 2*(this.length+this.breadth);
    }
    public void test(){
         System.out.println("accessible");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        rectangle s=new rectangle();
        s.length=5;
        s.breadth=10;
        System.out.println("area="+s.area());
        //s.test();
    }
    
}
