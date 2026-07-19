package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Sort Colors
    * Difficulty: Medium , Level 2/5 (DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/sort-colors/description/)
 */
public class SortArraysWithZeroesOnesAndTwos {
    // THIS IS THE TWO PASS SOLUTION
   /* public void sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0 , count1 = 0 , count2 = 0 , index = 0;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 0){
                count0 ++ ;
            } else if(nums[i]==1){
                count1 ++;
            } else count2++;
        }
        for(int i = 0 ; i< count0 ; i++){
            nums[index++] = 0;
        }
        for(int i = 0 ; i< count1 ; i++){
            nums[index++] = 1;
        }
        for(int i = 0 ; i< count2 ; i++){
            nums[index++] = 2;
        }
    }*/
    // FOR ONE PASS SOLUTION USING DUTCH FLAG ALGO.
        public void sortColors(int[] nums) {
            int n = nums.length;
            int low = 0 , mid = 0 , high = n-1;
            while(mid<=high){
                if(nums[mid] == 0 ){
                    swap(nums , mid , low);
                    mid ++ ;
                    low ++;
                }
                else if(nums[mid]== 1){
                    mid ++ ;
                } else {
                    swap(nums , mid , high);
                    high--;
                }
            }
        }
        public void swap (int[] arr , int x , int y){
            int temp = arr[x];
            arr[x] = arr [y];
            arr[y] = temp ;
        }


    public static void main(String[] args) {
        // for test cases
    }
}
