package Daily_Learning.Day_13_DivideAndConquer;

public class InversionCount {
   static int count = 0; // decaring as a gobal var.
   public static void main (String[] args){
       int [] arr = {2,4,1,3,5};
       mergeSort(arr);
     /* for(int ele: arr){
          System.out.print(ele + " ");
      }*/
       System.out.print("Total Inversion count: "+count);
   }
   static void mergeSort(int[]arr){
       int n = arr.length;
       if (n==1){ //Base case
           return;
       }
       //Create two new empty arrays of length n/2 ,n-n/2 .
       int n1 = n/2;
       int n2 = n - n/2;
       int index = 0;
       int[] a = new int[n1];
       int[] b = new int[n2];
       // copy elements in new arrays
       for(int i=0 ; i<n1 ; i++){
           a[i] = arr[index++];
       }
       for(int i=0 ; i<n2 ; i++){
           b[i] = arr[index++];
       }
       //Using recursion
       mergeSort(a);
       mergeSort(b);
       //merge two sorted aaray
       mergeTwoSortedArray(a,b,arr);
   }
   static void mergeTwoSortedArray(int[] a , int[] b , int[] c){
       int i = 0 , j= 0, k= 0;
       while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               c[k++] = a[i++];
           } else {
               if(a[i] > b[j]){ // for counting inversion pair
                   count += (a.length-i);
               }
               c[k++] = b[j++];
           }
       }
       while (i<a.length) c[k++] = a[i++]; // if i became greater than the array length then loop eill exit.
       while (j<b.length) c[k++] = b[j++]; // copy remaining element into the new arr.

   }

}
