

class subject{
    private int subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public subject(int sid,String sname){
        subId=sid;
        name=sname;
    }
    public void setmaxMarks(int marks){
        if(marks>0){
            maxMarks=marks;
        }
        else{
            maxMarks=1;
        }
    }
    public void setmarksObtain(int marks){
        if(marks>0){
            marksObtain=marks;
        }
        else{
            marksObtain=0;
        }
    }
    public String toString(){
        return "\nsub id:"+subId+"\nname:"+name+"\nmaxMarks:"+maxMarks+"\nmarksObtain:"+marksObtain;
    }

}
class student{
    private int sid;
    private String sname;
    private subject[] arr;
    public student(int id,String name){
        sid=id;
        sname=name;
    }
    public void setsubjects(subject[] s){
        arr=s;
    }
    public subject[] getSubjects(){
        return arr;
    }
    public String getdetails(){
        return "sid:"+sid+"\nsname:"+sname;
    }
}
public class arrayofobjects {
    public static void main(String[] args) {
        subject s[]=new subject[3];
        s[0]=new subject(1,"maths");
        s[1]=new subject(2,"physics");
        s[2]=new subject(3,"chemistry");
        s[0].setmaxMarks(100);
        s[1].setmaxMarks(50);
        s[2].setmaxMarks(100);
        s[0].setmarksObtain(75);
        s[1].setmarksObtain(40);
        s[2].setmarksObtain(90);
        System.out.println("For sub 0:\n"+s[0].toString());
        System.out.println("For sub 1:\n"+s[1].toString());
        System.out.println("For sub 2:\n"+s[2].toString());

        student ajay=new student(1,"Ajay");
        ajay.setsubjects(s);
        subject arr[]=ajay.getSubjects();
        System.out.println("for sub 0 arr[0]=:"+arr[0].toString());
        System.out.println("student details:"+ajay.getdetails());

    }
}
