package DSA_Master_Sheet.Topic_14_Heaps;

import java.util.PriorityQueue;
/*
    * Problem Name : Nearly Sorted Array
    * Difficulty : Medium
    * Platform : GFG (https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1)
 */
public class NearlySortedArray {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0){
            arr[idx++] = pq.remove();
        }
    }
}
