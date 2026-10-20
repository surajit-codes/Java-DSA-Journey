package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashMap;
/*
    * Problem Name : Two Sum
    * Difficulty: easy
    * Platform : LeetCode (https://leetcode.com/problems/two-sum/description/)
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)) return new int[]{map.get(rem) , i};
            map.put(nums[i] , i);
        }
        return new int[] {};
    }
}
