package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Rearrange Elements By Sign
    * Difficulty: Medium , Level 3/5(DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/rearrange-array-elements-by-sign/)
 */
public class RearrangeElementsBySign {
    // Direct Placed in resultant array T.C = O(n)
        public int[] rearrangeArray(int[] nums) {
            int pos = 0 , neg =1;
            int[] finalArr= new int[nums.length];
            for(int i =0 ; i< nums.length ; i++){
                if(nums[i]>0){
                    finalArr[pos] = nums[i];
                    pos+=2;
                } else{
                    finalArr[neg] = nums[i];
                    neg+=2;
                }
            }
            return finalArr;
        }
    // Using two temporary array Time complexity O(n) and space O(n)
   /* public int[] rearrangeArray(int[] nums) {
        int pos = 0 , neg =0;
        int[] posArr = new int[nums.length/2];
        int[] negArr = new int[nums.length/2];
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]>0){
                posArr[pos++] = nums[i];
            }
            else negArr[neg++] = nums[i];
        }
        pos = 0;
        neg = 0;
        for(int i = 0 ; i < nums.length ; i += 2){
            nums[i] = posArr[pos++];
            nums[i+1] = negArr[neg++];
        }
        return nums;
    }*/

}
