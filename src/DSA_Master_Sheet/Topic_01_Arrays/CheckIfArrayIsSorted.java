package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Check If Array Is Sorted
    * Difficulty: 1 (Easy)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1)
 */
public class CheckIfArrayIsSorted {
    public boolean isSorted(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
