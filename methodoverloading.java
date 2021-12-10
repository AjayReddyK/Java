public class methodoverloading {
    static double area(int l,int b){
        return l*b;
    }
    static double area(int r){
        return 3.14*r*r;
    }
    static double area(int l,int b,int h){
        return l*b*h;
    }
    public static void main(String[] args) {
        System.out.println(area(2,5));
        System.out.println(area(5));
        System.out.println(area(1,2,3));
    }
    
}
