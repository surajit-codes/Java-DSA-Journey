package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashMap;
/*
    * Problem Name: Valid Anagram
    * Difficulty : Easy
    * Platform: LeetCode (https://leetcode.com/problems/valid-anagram/description/)
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            arr1[i] = s.charAt(i);
            arr2[i] = t.charAt(i);
        }
        for(char ele : arr1){
            if(map.containsKey(ele)) map.put(ele , map.get(ele)+1);
            else map.put(ele , 1);
        }
        for(char ele : arr2){
            if(map2.containsKey(ele)) map2.put(ele , map2.get(ele)+1);
            else map2.put(ele , 1);
        }
        for(char ele : arr1){
            if(!map.get(ele).equals(map2.get(ele))) return false;
        }
        return true;
    }
}
