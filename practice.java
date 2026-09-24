//minimum,max
// import java.util.*;
// public class practice {
//     public static void main(String[] args) {
//         int[] arr={23,56,-2,445};
//         System.out.println(maximum(arr, 0, 3));
//     }
//     public static int maximum(int[] arr,int index,int n)
//     {
//          n=arr.length;
//         if(index==arr.length-1){
//             return arr[index];
//         }
//    int findmax=maximum(arr,index+1,n-1);
//    return Math.max(arr[index],findmax);
//     }
    
// }

//find uppercase
// public class practice{
//     public static void main(String[] args) {
//         String str="geekforGeeks";
//         char ans=findfirst(str);
//         System.out.println(ans);
//     }
//     public static char findfirst(String str){
//         if(str.isEmpty()){
//             return 0;
//         }
//         char ch = str.charAt(0);
//         if(Character.isUpperCase(ch)){
//             return ch;
//         }
//            return findfirst(str.substring(1));
        
//     }
// }

