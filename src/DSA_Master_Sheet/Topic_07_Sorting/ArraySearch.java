package DSA_Master_Sheet.Topic_07_Sorting;
/*
    * Problem Name: Linear search in an array
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG(https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1)

 */
public class ArraySearch {
    public int search(int arr[], int x) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==x)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
