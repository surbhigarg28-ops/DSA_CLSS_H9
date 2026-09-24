
//1)bubble sort

// import java.util.Arrays;

// public class sorting {
//     public static void main(String[] args) {
//         int []arr={3,67,89,65};
//         bubble(arr,arr.length-1,0);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void bubble(int[] arr,int r,int c){
//         if(r==0){
//             return ;
//         }
//         if(c<r){
//             if(arr[c]>arr[c+1]){
//                 int temp = arr[c];
//                 arr[c]=arr[c+1];
//                 arr[c+1]=temp;
            
//             }
//             bubble(arr, r, c+1);
//         }else{
//             bubble(arr,r-1,0);
//         }
//     }
// }

//2by iterative
// public class sorting{
//     public static void main(String[] args) {
//         int[] arr={5,1,4,2,8};
//         System.out.println("Before sorting");
//         printArray(arr);
//         bubblesort(arr);
//         System.out.println("After sorting");
//         printArray(arr);
//     }
//     public static void bubblesort(int[]arr){
//     int n=arr.length;
//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     }
//     }
//     public static void printArray(int [] arr){
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
//     }
// }

//selection sort
// class sorting{
//     public static void main(String[] args) {
//         int n=5;
//         int arr[] = {4,1,5,2,3};
//       selection(arr);
//       printarr(arr);
        
//     }
//     public static void selection(int []arr){
//         for(int i=0;i<arr.length;i++){
//             int smallidx=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[smallidx]){
//                     smallidx=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[smallidx];
//             arr[smallidx]=temp;

//         }
//     }
//     public static void printarr(int[]arr){
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
//     }
// }

// public class sorting {
//     public static void main(String[] args) {
//         int arr[] = {4, 1, 5, 2, 3};
//         selectionRec(arr, 0, arr.length);
//         printarr(arr);
//     }

//     // Recursive Selection Sort
//     public static void selectionRec(int[] arr, int i, int n) {
//         // Base case
//         if (i >= n - 1) return;

//         // Find the minimum element index from i to n-1
//         int minIndex = findMinIndex(arr, i, i + 1, n, i);

//         // Swap arr[i] with arr[minIndex]
//         int temp = arr[i];
//         arr[i] = arr[minIndex];
//         arr[minIndex] = temp;

//         // Recursive call for remaining part
//         selectionRec(arr, i + 1, n);
//     }

//     // Recursive function to find index of minimum element
//     public static int findMinIndex(int[] arr, int i, int j, int n, int minIndex) {
//         if (j == n) return minIndex;

//         if (arr[j] < arr[minIndex]) {
//             minIndex = j;
//         }

//         return findMinIndex(arr, i, j + 1, n, minIndex);
//     }

//     public static void printarr(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

//3)merge sort
// class sorting{
//     public static void main(String[] args) {
//         int arr[]={12,31,35,8,32,17};
//         int n=arr.length;
//         mergeSort(arr,0,arr.length-1);
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
        

//     }
//     public static void merge(int[]arr,int st,int mid,int end){
// int[] temp = new int[end-st+1];
// int i=st,j=mid+1;
// int idx=0;
// while(i<=mid && j<=end){
// if(arr[i]<=arr[j]){
//     temp[idx++]=arr[i];
//     i++;
// }else{
//     temp[idx++]=arr[j];
//     j++;
// }
// }
// while(i<=mid){
//     temp[idx++]=arr[i++];
// }
// while(j<=end){
//     temp[idx++]=arr[j++];
// }
// for(int idc=0;idc<temp.length;idc++){
//     arr[idc+st]=temp[idc];
// }
//     }
//     //recursively splitting left half right half
//     public static void mergeSort(int[]arr,int st,int end){
//         if(st>=end){
//             return;
//         }
//         int mid=st+(end-st)/2;
//         mergeSort(arr, st, mid);
//         mergeSort(arr,mid+1,end);
//         merge(arr, st, mid, end);
//     }

// }

//quick sort
public class sorting{
public static void main(String[] args) {
    int [] arr={10,80,30,90,50,70};
    System.out.println("Before sorting");
    printarr(arr);
    quicksort(arr,0,arr.length-1);
    System.out.println("after sorting");
    printarr(arr);
}
public static int partition(int[]arr,int st,int end){
    int pivot=arr[end];
    int i = st-1;
    for(int j=st;j<end;j++){
        if(arr[j]<=pivot){
            i++;
            swap(arr,i,j);
        }
    }
    swap(arr,i+1,end);
    return i+1;
}
public static void swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
public static void quicksort(int[]arr,int st,int end){
    if(st<end){
        int pvi=partition(arr, st, end);
        quicksort(arr, st, pvi-1);
        quicksort(arr, pvi+1, end);
    }
}
public static void printarr(int[]arr){
    for(int num:arr){
        System.out.print(num+" ");
    }
}
}

