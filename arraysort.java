
public class arraysort {
    public static void main(String[] args) {
        int ar[]={6,5,4,3,2,1};
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
}
