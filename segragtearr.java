import java.util.*;
public class segragtearr {
    public static void main(String[] args) {
        int []arr={0,1,0,1,1,0,0,1};
        int left=0;
        int right=arr.length-1;
         while(left<right){
            //move left if 0
            while(arr[left]==0 && left<right){
                left++;
            }
            // move right if
            while(arr[right]==1 && left<right){
            right--;
         }
    }
    System.out.println(Arrays.toString(arr));
}
}
