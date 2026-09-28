 import java.util.*;

public class revrsesorting {
    public  static void main(String[] args) {
        int []arr={9,8,7,6,5,-1,4,-5};
        for(int i=1; i<=arr.length-1;  i++){
            boolean isSorted=true;
            for(int j=0; j<arr.length-1; j++){
               if(arr[j]<arr[j+1]){
                   isSorted=false;
                   break;
               }
            }
            if(isSorted==true) break;
            for(int j=0; j<arr.length-1-i;  j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
          System.out.print(Arrays.toString(arr));

    }
}



