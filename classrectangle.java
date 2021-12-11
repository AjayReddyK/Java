class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
}
public class classrectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=5;
        r.breadth=10;
        System.out.println("area="+r.area());

    }
    
}
