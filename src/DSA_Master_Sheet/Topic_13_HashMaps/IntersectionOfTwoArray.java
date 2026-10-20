package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashSet;
/*
    * Problem Name: Intersection of Two Arrays
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/intersection-of-two-arrays/)
 */
public class IntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int i = 0;
        for ( int ele : nums1){
            set1.add(ele);
        }
        for(int ele : nums2){
            if(set1.contains(ele)) set2.add(ele);
        }
        int[] ans = new int[set2.size()];
        for (int ele : set2){
            ans[i++] = ele;
        }
        return ans;
    }
}
