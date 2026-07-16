package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Reverse an Array
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/reverse-an-array/1)
 */
public class ReverseAnArray {
    public void reverseArray(int arr[]) {
        int i = 0 , j = arr.length -1;
        while(i<=j){
            int temp  = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        // for test cases.
    }
}
