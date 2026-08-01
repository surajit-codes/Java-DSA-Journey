package DSA_Master_Sheet.Topic_05_BinarySearch;
/*
     * Problem Name: Search x in sorted array
     * Difficulty: Easy , Level 2/5
     * Platform: LeetCode(https://leetcode.com/problems/binary-search/)
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int hi = nums.length -1 , lo = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(target>nums[mid]) lo = mid+1;
            else if(target<nums[mid]) hi = mid-1;
            else {
                return mid;
            }
        }
        return -1;
    }
}
