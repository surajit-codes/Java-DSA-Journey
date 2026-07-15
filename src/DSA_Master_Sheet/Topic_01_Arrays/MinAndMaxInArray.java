package DSA_Master_Sheet.Topic_01_Arrays;
import java.util.ArrayList;
/*
    * Problem Name: Min and Max in Array
    * Difficulty: 1 (Easy)
    * Platform : GFG (https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1)
 */

public class MinAndMaxInArray {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }

    public static void main(String[] args) {
        // for test cases
    }
}
