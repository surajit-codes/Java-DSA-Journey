package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashMap;
/*
    * Problem Name : Count number of equal pairs in string
    * Difficulty : Easy
    * Platform : GFG (https://www.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string0520/1)
 */
public class CountNoOfEqualPairsInString {
    public int equalPairs(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int count = 0;
        for(int freq : map.values()){
            count += freq*freq;
        }
       /* for(int i = 0 ; i < s.length() ; i++){
            int freq = map.get(s.charAt(i));
            count += freq  ;
        }*/
        return count;
    }
}
