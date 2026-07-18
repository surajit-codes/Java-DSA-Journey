package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Move Zeroes to End
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/move-zeroes/)
 */
public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int n  = nums.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        while(j<n){
            nums[j++] = 0;
        }
    }
    public static void main(String[] args) {
        // for test cases
    }
}
