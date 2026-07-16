package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Missing Number
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/missing-number/)
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n  = nums.length;
        int arraySum = 0;
        for(int i = 0 ; i < n ; i++){
            arraySum += nums[i];
        }
        int actualSum = (n*(n+1))/2;
        return actualSum - arraySum;
    }
    public static void main(String[] args) {
        // for test case
    }
}
