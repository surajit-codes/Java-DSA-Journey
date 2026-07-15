package DSA_Master_Sheet.Topic_01_Arrays;

import java.util.ArrayList;

/*
    * Problem Name: Alternates in Array
    * Difficulty: 1 (Easy)
    * Platfotm : GFG (https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1)
 */
public class AlternatesInArray {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
