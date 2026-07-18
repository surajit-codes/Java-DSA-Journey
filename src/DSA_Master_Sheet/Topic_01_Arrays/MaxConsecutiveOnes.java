package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Maximum Consecutive Ones
    * Difficulty: Easy , Level 2/5(DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/max-consecutive-ones/)
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , maxCount = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 1){
                count++;
                if(count>maxCount) maxCount = count;
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
