package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashSet;
/*
    * Problem Name: Longest Distinct Character in String
    * Difficulty: Medium
    * Platform: GFG(https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1)
 */
public class LongestDistinctCharacterInString {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0 , j = 0 , maxLength = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength , j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
