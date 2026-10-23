package DSA_Master_Sheet.Topic_14_Heaps;

import java.util.PriorityQueue;
/*
 * Problem Name : Minimum costs to Connect Ropes
 * Difficulty : Medium
 * Platform : GFG(https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1)
 */
public class MinimumCostOfRopes {
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        int ans=0;
        while(pq.size()> 1){
            int smallest = pq.remove();
            int secSmallest = pq.remove();
            int sum = smallest + secSmallest;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
}
