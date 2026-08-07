package DSA_Master_Sheet.Topic_07_Sorting;
import java.util.Arrays;
/*
    * Problem Name: Maximum Gap
    * Difficulty: Medium , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/maximum-gap/description/)
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        // O(nlogn) Time Complexity (As not done radix sort yet)
        int n = nums.length , diff = 0;
        if(n<2) return 0;
        Arrays.sort(nums);
        for(int i =1 ; i<n ; i++){
            diff = Math.max(diff , nums[i] - nums[i-1]);
        }
        return diff;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
