package DSA_Master_Sheet.Topic_14_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;
/*
    * Problem Name : Kth Smallest Element
    * Difficulty : Medium
    * Platform : GFG ( https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1 )
 */
public class KthSmallestElement {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();

    }
}
