//print subsequnces

// import java.util.*;
// public class arr{
//     public static void main(String[] args) {
//         int[] arr={1,2,3};
//         List<Integer>curr = new ArrayList<>();
//         printsubsequnces(0, arr, curr);
//     }
//     public static  void printsubsequnces(int index,int[]arr,List<Integer>curr){
//         if(index==arr.length){
//             System.out.println(curr);
//             return;
//         }
//         curr.add(arr[index]);
//         printsubsequnces(index+1, arr, curr);
//         curr.remove(curr.size()-1);
//         printsubsequnces(index+1, arr, curr);
//     }
// }

//print subsequnces having sum =2

// import java.util.ArrayList;
// import java.util.List;
// public class arr{
//     public static void main(String[] args) {
//         int [] nums={1,2,1};
//         List<List<Integer>>ans=new ArrayList<>();
//         printsubsequnces(0,nums,new ArrayList<>(),ans,0,2);
//         System.out.println(ans);
//     }
//     public static void printsubsequnces(int index,int[]nums,List<Integer>curr,List<List<Integer>>ans,int sum,int target)
// {
// if(index==nums.length){
//     if(sum==target){
//     ans.add(new ArrayList<>(curr));
//     }
//     return;
// }
// curr.add(nums[index]);
// printsubsequnces(index+1, nums, curr, ans, sum+nums[index], target);
// curr.remove(curr.size()-1);
// printsubsequnces(index+1, nums, curr, ans, sum, target);

// }
// }

//print one subsequnece having just sum
// public class arr {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 1};
//         int target = 2;

//         int count = countSubsequences(0, nums, 0, target);
//         System.out.println("Count of subsequences with sum " + target + " is: " + count);
//     }

//     public static int countSubsequences(int index, int[] nums, int sum, int target) {
//         if (index == nums.length) {
//             if (sum == target) return 1; // ✅ valid subsequence
//             else return 0; // ❌ not a valid subsequence
//         }

//         // Pick the element
//         int pick = countSubsequences(index + 1, nums, sum + nums[index], target);

//         // Not pick the element
//         int notPick = countSubsequences(index + 1, nums, sum, target);

//         return pick + notPick; // 🔁 total count from both choices
//     }
// }


// import java.util.*;
// public class arr{
//     public static void main(String[] args){
//         List<List<Integer>>list =new ArrayList<>();
//         int[]arr = {3,1,2};
//         helper(0,arr,new ArrayList<>(),list);
//         System.out.println(list);
//     }
//   public static void helper(int index,int[]nums,List<Integer>curr,List<List<Integer>>ans){
//     if(index==nums.length){
//         ans.add(new ArrayList<>(curr));
//         return;
//     }
//     curr.add(nums[index]);
//     helper(index+1,nums,curr,ans);
//     curr.remove(curr.size()-1);
//     helper(index+1, nums, curr, ans);
//   }

// }


// import java.util.*;
// public class arr{
//     public static void main(String[] args){
//         List<Integer>list =new ArrayList<>();
//         int[]arr = {3,1,2};
//         helper(0,arr,list,0);
//         System.out.println(list);
//     }
//   public static void helper(int index,int[]nums,List<Integer>ans,int sum){
//     if(index==nums.length){
//         ans.add(sum);
//         return;
//     }
   
//     helper(index+1,nums,ans,sum+nums[index]);
  
//     helper(index+1, nums,  ans,sum);
//   }

// }

//merge sort
// class arr {
    
//     // Main merge sort function
//     public void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;

//         int mid = low + (high - low) / 2;
//         mergeSort(arr, low, mid);      // left half
//         mergeSort(arr, mid + 1, high); // right half
//         merge(arr, low, mid, high);    // merge halves
//     }

    // Merge step
//     private void merge(int[] arr, int low, int mid, int high) {
//         int[] temp = new int[high - low + 1];
//         int i = low, j = mid + 1, k = 0;

//         while (i <= mid && j <= high) {
//             if (arr[i] <= arr[j]) temp[k++] = arr[i++];
//             else temp[k++] = arr[j++];
//         }
//         while (i <= mid) temp[k++] = arr[i++];
//         while (j <= high) temp[k++] = arr[j++];

//         for (int x = 0; x < temp.length; x++) arr[low + x] = temp[x];
//     }

//     // Test
//     public static void main(String[] args) {
//         arr obj = new arr();
//         int[] arr = {5, 2, 9, 1, 6, 3};
//         obj.mergeSort(arr, 0, arr.length - 1);

//         // Print sorted array
//         for (int num : arr) System.out.print(num + " ");
//     }
// }

// merge sort
// class arr{
//     public static void main(String[] args) {
//         int[] arrr ={5,2,3,1};
//         int n =arrr.length;
//         mergeSort(arrr,0,n-1);
//         for(int num:arrr){
//             System.out.println(num+"");
//         }
//     }
//     public static void mergeSort(int[]nums,int low,int high){
//         if(low>=high) return;
//         int mid = low+(high-low)/2;
//         mergeSort(nums, low, mid);
//         mergeSort(nums, mid+1, high);
//         merge(nums,low,high,new int[high-low+1]);
//     }
//     public static void merge(int[]nums,int low,int high,int[]temp){
//         int mid = low+(high-low)/2;
//         int i=low,j=mid+1,k=0;
//         while(i<=mid && j<=high){
//             if(nums[i]<nums[j]){
//                 temp[k++]=nums[i++];
//             }else{
//                 temp[k++]=nums[j++];
//             }
//         }
//         while(i<=mid){
//             temp[k++]=nums[i++];
//         }
//         while(j<=high){
//             temp[k++]=nums[j++];
//         }
//         for(int x=0;x<temp.length;x++){
//             nums[low+x]=temp[x];
//         }
//     }
// }
//nums[i]>nums[j]
// class arr{
//     public static void main(String[] args) {
//         int[] arrr ={5,2,3,1};
//         int n =arrr.length;
//         mergeSort(arrr,0,n-1);
//         for(int num:arrr){
//             System.out.println(num+"");
//         }
//     }
//     public static int mergeSort(int[]nums,int low,int high){
//             if(low>=high){
//                 return 0;
//             }

//         int invcount=0;
//         int mid = low+(high-low)/2;
//        invcount+= mergeSort(nums, low, mid);
//        invcount+= mergeSort(nums, mid+1, high);
//        invcount+= merge(nums,low,high,new int[high-low+1]);
//        return invcount;
    
// }
//     public static int merge(int[]nums,int low,int high,int[]temp){
//         int count=0;
//         int mid = low+(high-low)/2;
//         int i=low,j=mid+1,k=0;
//         while(i<=mid && j<=high){
//             if(nums[i]<nums[j]){
//                 temp[k++]=nums[i++];
//             }else{
//                 count+=mid-i+1;
//                 temp[k++]=nums[j++];
//             }
//         }
//         while(i<=mid){
//             temp[k++]=nums[i++];
//         }
//         while(j<=high){
//             temp[k++]=nums[j++];
//         }
//         for(int x=0;x<temp.length;x++){
//             nums[low+x]=temp[x];
//         }
//         return count;
//     }
// }