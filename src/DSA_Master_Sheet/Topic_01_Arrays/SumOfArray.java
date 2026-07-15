package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Sum of Array
    * Difficulty: 1 (Easy)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/sum-all-array-elements/1)

*/
public class SumOfArray {
    public int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
