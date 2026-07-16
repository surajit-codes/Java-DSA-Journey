package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Remove Duplicate From Sorted Array
    * Difficulty: Easy(LeetCode) level 2/5 (Dsa Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0 , j = 1;
        while(j<n){
            if(nums[i] == nums[j]) j++;
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        // for test cases
    }
}
