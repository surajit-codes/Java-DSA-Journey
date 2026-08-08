package DSA_Master_Sheet.Topic_07_Sorting;
import java.util.ArrayList;
import java.util.Arrays;
/*
    * Problem Name: Sort Element By Decreasing Frequency
    * Difficulty: Medium , Level 3/5(DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1)
    * AS I HAVEN'T DONE HASHMAP YET SO SOLVED BY BRUTE FORCE METHOD WITH A BAD TIME COMPLEXITY
    * logic: sort array first ---> then count frequency and add element in two distinct array -->
              copy that freq in a new array then sort that ----> match freq with this sort array with org freq array-->
               and then add with corresponding element by freq.
 */
public class SortElementDecreasingFrequency {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int  n = arr.length;
        Arrays.sort(arr);
        int [] ele = new int[n];
        int [] freq = new int[n];
        int a = 0 , b=1 , eleIdx = 0 , freqIdx = 0;
        while(b<n){
            if(arr[a]==arr[b]){
                b++;
            } else{
                freq[freqIdx++] = b-a;
                ele[eleIdx++] = arr[a];
                a=b;
            }
        }
        freq[freqIdx] = b-a;
        ele[eleIdx] = arr[a];
        int [] sortFreq = new int[freqIdx+1];
        for(int i = 0 ; i <= freqIdx ; i++){
            sortFreq[i] = freq[i];
        }
        Arrays.sort(sortFreq);
        boolean[] visited = new boolean[freqIdx+1];
        for(int i = freqIdx ; i>=0 ; i--){
            for(int j = 0 ; j <= freqIdx ; j++){
                if(sortFreq[i] == freq[j] && visited[j] == false){
                    visited[j] = true;
                    for(int k = 0 ; k < freq[j] ; k++){
                        ans.add(ele[j]);
                    }
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
