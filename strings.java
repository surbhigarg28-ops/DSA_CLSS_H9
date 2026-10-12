// public class strings {
//      static void subsequences(String p,String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return ;
//         }
//         char ch =  up.charAt(0);
//         subsequences(p, up.substring(1));
//         subsequences(p+ch, up.substring(1));
//     }
//     public static void main(String[] args) {
//        subsequences("","abcd");

//     }
    
// }

// public class strings{
//     public static void main(String[] args) {
//        System.out.println( count("", "abcd"));
//     }
//     public static int count(String p,String up) {
//         if(up.isEmpty()){
//             return 1;
//         }
//         char ch = up.charAt(0);
//         int left=count(p, up.substring(1));
//         int right=count(p, up.substring(1));
//         return left+right;
//     }
// }

public class strings{
    static void asciisubsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        asciisubsequence(p, up.substring(1));
        asciisubsequence(p+ch, up.substring(1));
        asciisubsequence(p+(ch+0), up.substring(1));
    }
    public static void main(String[] args) {
        asciisubsequence("", "ab");
    }
}

//return subsequences as list
// import java.util.*;
// public class strings{
//     static List<String> subsequences(String p,String up){
//         if(up.isEmpty()){
//             List<String>list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }
//         char ch = up.charAt(0);
//         List<String>left=subsequences(p, up.substring(1));
//         List<String>right=subsequences(p+ch, up.substring(1));
//         left.addAll(right);
//         return left
//         ;
//     }
//     public static void main(String[] args) {
//         List<String> result = subsequences("","abc");
//         result.remove("");
//         System.out.println(result);
//     }
// }

// public class strings{
//     static void permutation(String p,String up){
// if(up.isEmpty()){
//     System.out.println(p);
//     return;
// }
// char ch = up.charAt(0);
// for(int i=0;i<=p.length();i++){
//     String f=p.substring(0,i);
//     String s = p.substring( i);
//     permutation(f+ch+s,up.substring(1));
// }
//     }
    
//     public static void main(String[] args) {
//         permutation("", "abc");
//     }
// }