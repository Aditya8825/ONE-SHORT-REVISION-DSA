// import java.util.*;
// public class armstrongnum {
//     static  int countdigit(int n){
//         int count=0;
//         while(n!=0){
//             count++;
//             n=n/10;
//         }
//         return  count;
//     }
//     static int power(int base,int exponent){
//         int result=1;
//         for(int i=1; i<=exponent; i++){
//             result=result*base;
//         }
//         return result;
//     }
//     static boolean isArmstrong(int n){
//         int original=n;
//         int digits=countdigit(n);
//         int sum=0;
//         while(n!=0){
//             int digit =n%10;
//             sum=sum+power(digit,digits);
//             n=n/10;
//         }
//         return  sum==original;
//     }
//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           System.out.print("enter number : ");
//           int n=sc.nextInt();

//           if(isArmstrong(n)){
//             System.out.println("Armstrong number: ");
//           }else{
//             System.out.println("not armstrong ");
//           }
        
          
//     }
// }
