package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Segregate 0's and 1's
    * difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1)
 */
public class SegregateZerosAndOnes {
    void segregate0and1(int[] arr) {
        int n = arr.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                arr[j++] = 0;
            }
        }
        while(j<n){
            arr[j++] = 1;
        }
    }
    public static void main(String[] args) {
        // for test cases
    }
}
