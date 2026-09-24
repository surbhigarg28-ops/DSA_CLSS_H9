// public class backtrack {
//     public static void main(String[] args) {
//         int rows=2;
//         int cols=3;
//         int count=maze(1,1,rows,cols);
//         System.out.println(count);
//     }
//     public static int maze(int sr,int sc,int er,int ec){
//         if(sr>er || sc>ec){
//             return 0;
//         }
//         if(sr==er && sc==ec){
//             return 1;
//         }
//         int downways=maze(sr+1,sc,er,ec);
//         int rightways=maze(sr,sc+1,er,ec);
//         int totalways=downways+rightways;
//         return totalways;
//     }
// }

//print path
// public class backtrack {
//     public static void main(String[] args) {
//         int rows = 2;
//         int cols = 3;
//         mazeprint(1, rows, 1, cols, "");  // ✅ fix here
//     }

//     public static void mazeprint(int sr, int er, int sc, int ec, String s) {
//         if (sr > er || sc > ec) {
//             return;
//         }
//         if (sr == er && sc == ec) {
//             System.out.println(s);
//             return;
//         }
//         mazeprint(sr + 1, er, sc, ec, s + "D");  // Move down
//         mazeprint(sr, er, sc + 1, ec, s + "R");  // Move right
//     }
// }

//four direction
// public class backtrack {
//     public static void main(String[] args) {
//         int rows = 3;
//         int cols = 3;
//         boolean[][]isvisited=new boolean[rows][cols];
//         mazeprint(0, rows-1, 0, cols-1, "",isvisited);  // ✅ fix here
//     }

//     public static void mazeprint(int sr, int er, int sc, int ec, String s,boolean[][]isvisited) {
//          if(sr<0 || sc<0||sr>er||sc>ec)return;
         
//         if(isvisited[sr][sc]==true){
//             return;
//         }
       
        
//         if (sr == er && sc == ec) {
//             System.out.println(s);
//             return;
//         }
//         isvisited[sr][sc]= true;
//        mazeprint(sr, er, sc+1, ec, s+"R",isvisited);
//          mazeprint(sr+1, er, sc , ec, s + "D",isvisited);
//          mazeprint(sr, er, sc-1 , ec, s + "L",isvisited);   
//          mazeprint(sr-1, er, sc , ec, s + "U",isvisited); 
//          //backtracking
//          isvisited[sr][sc]=false;
//     }
// }

//with a blocked path
// public class backtrack{
//     public static void main(String[] args) {
//         int rows=3;
//         int cols=3;
//         // int[][]maze={
//         //     {1,0,1,1,1},
//         //     {1,1,1,1,0,1},
//         //     {0,1,1,1,1,1},
//         //     {0,0,1,0,1,1} };
//         int[][]maze={
//             {1,0,1},
//             {1,1,1},
//             {0,1,1}
//         };
          
//             print(0,0,rows-1,cols-1,"",maze);
//     }
//     public static void print(int sr,int sc,int er,int ec,String s,int[][]maze){
//         if(sr>er||sc>ec){
//             return;
//         }
//         if(sr==er && sc==ec){
//             System.out.println(s);
//             return;
//         }
//         if(maze[sr][sc]==0){
//             return;
//         }
//         print(sr, sc+1, er, ec, s+"R", maze);
//         print(sr+1, sc, er, ec, s+"D", maze);
//     }
// }

// public class backtrack{
//     public static void main(String[] args) {
//         int rows=3;
//         int cols=4;
//         int[][]maze={
//             {1,0,1,1},
//             {1,1,1,1},
//             {1,1,0,1}
//         };
//         boolean [][]visited=new boolean[rows][cols];
//         print(0,0,rows-1,cols-1,"",maze,visited);
//     }
//     public static void print(int sr,int sc,int er,int ec,String s,int[][]maze,boolean[][]visited){
//         if(sr<0||sc<0||sr>er||sc>ec) return;
//         if(maze[sr][sc]==0||visited[sr][sc])return;
//         if(sr==er && sc==ec){
//             System.out.println(s);
//             return;
//         }
//       visited[sr][sc]=true;
//       //go right
//       print(sr, sc+1, er, ec, s+"R", maze, visited);
//       //go down
//       print(sr+1, sc, er, ec, s+"D", maze, visited);
//       //go left
//       print(sr, sc-1, er, ec, s+"L", maze, visited);
//       //go up
//       print(sr-1, sc, er, ec, s+"U", maze, visited);
//       visited[sr][sc]=false;
//     }
// }

// import java.util.ArrayList;
// import java.util.List;
// class backtrack{
//     public static void main(String[] args) {
//          List<String>list=new ArrayList<>();
//         String str="abc";
       
//         print(str,"",list);
//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i));
//         }
//     }
//     public static void print(String str,String t,List<String>l){
//         if(str.equals("")){
//             l.add(t);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             String left=str.substring(0, i);
//             String right=str.substring(i+1);
//             String rem=left+right;
//             print(rem, t+ch,l);
//         }
//     }
// }
//time complexity=0(n!*n)
//space complesixt=o(n!*n)