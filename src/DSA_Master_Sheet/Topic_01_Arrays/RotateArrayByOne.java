package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Rotate Array By One
    * Difficulty: Easy/Basic , Level 3/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)
 */
public class RotateArrayByOne {
    public void rotate(int[] arr) {
        // OPTIMAL SOLUTION
        if(arr.length<=1) return;
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        // USING EXTRA O(n) SPACES
        /*int[] ans = new int[arr.length];
        for(int i =1 ; i<=arr.length-1; i++){
            ans[i] = arr[i-1];
        }
        ans[0] = arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }*/

    }
}
