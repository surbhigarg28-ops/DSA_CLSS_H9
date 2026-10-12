//Q1)Print numbers from 1 to N
// public class basics {
//     public static void main(String[] args) {
//         print1toN(19, 1);
        
//     }
//     public static void print1toN(int n,int curr){
//         if(curr>n){
//             return;
//         }
//         System.out.print(curr+" ");
//         print1toN(n, curr+1);
//     }
// }

//Ques 2) Print numbers from N to 1
// public class basics{
//     public static void main(String[] args) {
//         printNto1(10);
//     }
//     public static void printNto1(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNto1(n-1);
//     }
// }

//ques3)sum of first n natural number
// public class basics{
//     public static void main(String[] args) {
//         int result=sumN(5);
//         System.out.println(result);
//     }
//     public static int sumN(int n){
//         if(n>10){
//       return n;

//         }
//         return helper(n);
//     }
//     public static int helper(int n){
//         if(n==0){
//             return 0;
//         }
// return n+helper(n-1);
//     }
// }

//Ques4)Factorial of  numebr
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }
//     public static int fact(int n){
//         if(n<=1){
//           return 1;
//         }
//         return n*fact(n-1);
//     }
// }

//Ques5)Calculate x^n 
// public class basics {
//     public static void main(String[] args) {
//         int result = power(2, 5);
//         System.out.println("Power = " + result);  // Output: 32
//     }

//     public static int power(int x, int n) {
//         if (n == 0) return 1;

//         return x * power(x, n - 1);
//     }
// }

//ques6)Fibonnacci number
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(fibonacci(5));
//     }
//     public static int fibonacci(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
// }

//QUes 7)count digits
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(count(3031));
//     }
//     public static int count(int n){
//         if(n<10){
//             return 1;
//         }
//         return 1+count(n/10);
//     }
// }

//Ques8)count numbers
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(count0(10203040));
//     }
//     public static int count0(int n){
//         if(n==0){
//             return 1;
//         }
//         return helper(n);
//     }

//     public static int helper(int n){
//         if(n==0){
//             return 0;
//         }
//         int rem = n%10;
//         if(rem==0){
//             return 1+helper(n/10);
//         }
        
//             return helper(n/10);
        
//     }

// }

//reverse a number
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(reverse(1234));
//         System.out.println(checkpalidrome(1234));
//     }
//     public static boolean checkpalidrome(int n){
//     return n==reverse(n);
//                 }
//     public static int reverse(int n){
//         if(n<10){
//             return n;
//         }
//         return helper(n, 0);
//     }
//     public static int helper(int n,int rev){
//         if(n==0){
//             return rev;
//         }
//         return helper(n/10,rev*10+n%10);
//     }
// }

//sum of digits
// public class basics{
//     public static void main(String[] args) {
//         System.out.println(sumofdigit(123));
//     }
//     public static int sumofdigit(int n){
//         if(n<10){
//             return n;
//         }
//         return helper(n);
//     }
//     public static int helper(int n){
//         if(n==0){
//             return 0;
//         }
//         return n%10+helper(n/10);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         System.out.println(count(0));
//     }
//     public static int count(int n){
//         if(n==4){
//             return n;
//         }
//  System.out.println(n);
//  return count(1+n);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         printname(0);
//     }
//     public static void  printname(int count){
//         if(count==5){
//             return ;
//         }
//         System.out.println("Surbhi");
//         printname(count+1);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         print1toN(5);
//     }
//     public static void print1toN(int n){
//         if(n<1){
//             return;
//         }
        
//         System.out.println(n);
//         print1toN(n-1);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         sumdigits(5, 0);
//     }
//     public static void sumdigits(int i,int sum){
//         if(i<1){
//             System.out.println(sum);
//             return;
//         }
// sumdigits(i-1, sum+i);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         System.out.println(sum(5));
//     }
//     public static int sum(int n){
//         if(n==0){
//             return 0;
//         }
//        return helper(n);
//     }
//     public static int helper(int n){
//         if(n==0){
//             return n;
//         }
//         return n+helper(n-1);
//     }
// }

// public class basics{
//     public static void main(String[] args) {
//         int[] arr={2,3,4,6};
//     f(0, arr, 4);
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     }
//     public static void f(int i,int []arr,int n){
//         if(i>=n/2){
//             return;
//         }
//         swap(arr,i,n-i-1);
//         f(i+1,arr,n);
//     }
//     public static void swap(int [] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j] =temp;
//     }
// }

//palidrome of a string check
// public class basics{
//     public static void main(String[] args) {
//         String str= "madam";
//         System.out.println(isPalidrome(str, 0));
//     }
//     public static boolean isPalidrome(String str,int i){
//         int n = str.length();
//         if(i>=n/2){
//             return true;
//         }
//         if(str.charAt(i)!=str.charAt(n-i-1)){
//                   return false;
//         }
//          return isPalidrome(str, i+1);
//     }
// }

