package DSA_Master_Sheet.Topic_01_Arrays;

import java.util.ArrayList;
import java.util.Collections;
/*
    * Problem Name: Array Leaders
    * Difficulty: Easy , Level 3/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1)
 */
public class ArrayLeaders {
    // Time complexity is O(n)
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i= n-1 ; i>=0 ; i--){
            if(arr[i] >= max) {
                max = arr[i];
                a.add(max);
            }
        }
        Collections.reverse(a);
        return  a;
    }
    // Time Complexity is almost O(n^2)
    /*static ArrayList<Integer> leaders(int[] arr){
        int n =arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0 ; i< n ; i++){
            boolean leader = true;
            for(int j = i+1 ; j<n ;j++){
                 if(arr[i]<arr[j]){
                     leader = false;
                     break;
                 }
            }
            if(leader) a.add(arr[i]);
        }
        return a;
    }*/

    public static void main(String[] args) {
        // for test cases
    }
}
