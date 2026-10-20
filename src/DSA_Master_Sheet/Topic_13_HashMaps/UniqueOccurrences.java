package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashMap;
import java.util.HashSet;
/*
    * Problem Name: Unique Number Of Occurrences
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/unique-number-of-occurrences/)
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)) map.put(ele , map.get(ele)+1);
            else map.put(ele , 1);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int ele : map.values()){
            if(set.contains(ele)) return false;
            set.add(ele);
        }
        return true;
    }
}
