package DSA_Master_Sheet.Topic_05_BinarySearch;
/*
    * Problem Name: Implement Lower Bound
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/implement-lower-bound/1)
 */
public class ImplementLowerBound {
    int lowerBound(int[] arr, int target) {
        int hi = arr.length-1 , lo = 0 , ans=arr.length;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>= target){
                ans  = mid;
                hi = mid-1;
            }
            else lo = mid +1;
        }
        return ans;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
