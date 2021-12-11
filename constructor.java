class cylinder{
    private double radius;
    private double height;
    public cylinder(){
        radius=height=1;
    }
    public cylinder(double r){
        radius=r;
        height=1;
    }
    public cylinder(double r,double h){
        radius=r;
        height=h;
    }
    public void setradius(double r){
        if(r>0){
            radius=r;
        }
        else{
            radius=1;
        }
    }
    public void setheight(double h){
        if(h>0){
            height=h;
        }
        else{
            height=1;
        }
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}

public class constructor {
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        cylinder c2=new cylinder(2);
        cylinder c3=new cylinder(2,3);
        System.out.println("c1="+c1.volume());
        System.out.println("c2="+c2.volume());
        System.out.println("c3="+c3.volume());
    }
}
