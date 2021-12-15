class Circle{
    private int radius;  //you can use protected keyword here to be accesible and updatable using subclass even after initialising it
    public Circle(int r){
        radius=r;  
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle{
    private int height;
    public Cylinder(int r,int h){
        super(r);
        height=h;
    }
    public double volume(){
        return height*area();
    }
}
public class inheritance {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(1,10);
        
        System.out.println("area="+c.area());
        System.out.println("volume="+c.volume());
    }
    
}
