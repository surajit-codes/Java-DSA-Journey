package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashSet;

/*
    * Problem Name: Contain Duplicate
    * Difficulty: Easy
    * Platform: LeetCode (https://leetcode.com/problems/contains-duplicate/description/)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int ele : nums){
            if(map.contains(ele)) return true;
            map.add(ele);
        }
        return false;
    }
}
