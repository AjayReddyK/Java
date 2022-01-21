package labprograms;

abstract class Shape{
    abstract double area();
    abstract double volume();
}
class Square extends Shape{
    public int side;
    public double area(){
        return side*side;
    }
    public double volume(){
        return 0;
    }
}
class Circle extends Shape{
    public double radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double volume(){
        return 0;
    }

}
class Cube extends Shape{
    public double side;
    public double area(){
        return 4*side*side;
    }
    public double volume(){
        return side*side*side;
    }
}
class Sphere extends Shape{
    public double radius;
    public double area(){
        return 2*3.14*radius*radius;
    }
    public double volume(){
        return 4/3*3.14*radius*radius*radius;
    }
}
