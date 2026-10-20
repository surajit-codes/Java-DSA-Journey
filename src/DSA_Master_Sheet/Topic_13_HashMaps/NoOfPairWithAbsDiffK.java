package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashMap;
/*
    * Problem Name : Numbers of pairs with absolute differences K
    * Difficulty : Easy
    * Platform : LeetCode (https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/)
 */
public class NoOfPairWithAbsDiffK {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)) map.put(ele , map.get(ele)+1);
            else map.put(ele , 1);
        }
        int count = 0;
        for(int ele : map.keySet()){
            int rem = ele - k;
            if(map.containsKey(rem)) count +=  map.get(rem) * map.get(ele);
        }
        return count;
    }
}
