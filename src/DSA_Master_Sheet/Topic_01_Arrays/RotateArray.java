package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Rotate Array
    * Difficulty: Medium
    * Platform: LeetCode (https://leetcode.com/problems/rotate-array)
 */
public class RotateArray {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr , n-k , n-1); // reversing k element from last
        reverse(arr , 0 , n-k-1); // reversing 1st to k-1 element
        reverse(arr , 0 , n-1); // reversing whole array
    }
    private void reverse (int[] arr , int f , int l){
        while(f<l){
            int temp = arr[f];
            arr[f++] = arr[l];
            arr[l--] = temp;
        }
    }
}
