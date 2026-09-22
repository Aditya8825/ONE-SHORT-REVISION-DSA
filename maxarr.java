import java.util.*;
public class maxarr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.print("enter arr length: ");
       int n=sc.nextInt();
       int []arr=new int[n];
      
     int max=arr[0];
       System.out.print("enter arr element");
       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }
         
       for(int i=0; i<n; i++){
        if(arr[i]>max)  max=arr[i];
       
       }
       System.out.println("max element:"+max);
    }
}
