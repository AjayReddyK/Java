class student{
    public String name=new String();
    public int id;
    public int m1,m2,m3;
    public int sum(){
        return m1+m2+m3;
    }
    public int average(){
        return (m1+m2+m3)/3;
    }
    public char grade(){
        int k=average();
        if(k>90){
            return 'A';
        }
        else if(k>80){
            return 'B';
        }
        else if(k>70){
            return 'C';
        }
        else{
            return 'P';
        }
    }

}
public class classstudent {
    public static void main(String[] args) {
        student s=new student();
        s.name="Ajay";
        s.id=171179;
        s.m1=85;
        s.m2=50;
        s.m3=70;
        System.out.println("name="+s.name);
        System.out.println("total="+s.sum());
        System.out.println("average="+s.average());
        System.out.println("grade="+s.grade());
        
    }
    
}
