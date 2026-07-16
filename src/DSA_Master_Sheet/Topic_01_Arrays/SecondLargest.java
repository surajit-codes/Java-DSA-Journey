package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: SecondLargest
    * Difficulty: Easy , level 2/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/second-largest3735/1)
    * Constraints - 2 ≤ arr.size() ≤ 105
                    1 ≤ arr[i] ≤ 105
 */
public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secMax < arr[i] && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
