package DSA_Master_Sheet.Topic_13_HashMaps;

import java.util.HashSet;
/*
    * Problem Name: Count Distinct In Array
    * Difficulty: Easy
    * Platform: GFG (https://www.geeksforgeeks.org/problems/find-distinct-elements--130928/1)
 */
public class CountDistinctInArray {
    public int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr)
            set.add(ele);
        return set.size();

    }
}
