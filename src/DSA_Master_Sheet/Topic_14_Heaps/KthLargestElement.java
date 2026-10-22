package DSA_Master_Sheet.Topic_14_Heaps;

import java.util.PriorityQueue;
/*
    * Problem Name : Kth Largest Element
    * Difficulty : Medium
    * Platform : GFG (https://www.geeksforgeeks.org/problems/kth-largest-element5034/1)
 */
public class KthLargestElement {
    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
