package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * Problem Name: Reverse an Array
    * Difficulty: Easy , Level 2/5(DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/reverse-an-array/1)
 */
public class ReverseAnArray {
    public void reverseArray(int arr[]) {
        revArr(arr , 0 , arr.length-1);
    }
    private void revArr(int[] arr , int start , int end){
        if(start >= end) return;
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
        revArr(arr, start , end);
    }
}
