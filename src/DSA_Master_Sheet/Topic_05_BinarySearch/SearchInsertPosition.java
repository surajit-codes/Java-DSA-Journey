package DSA_Master_Sheet.Topic_05_BinarySearch;
/*
    * Problem Name: Search Insert Position
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int hi = nums.length-1 , lo = 0;
        while(lo<=hi){
            int mid  = lo + (hi - lo)/2;
            if(nums[mid]>target) hi= mid -1;
            else if (nums[mid]<target) lo = mid +1;
            else return mid;
        }
        return lo;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
