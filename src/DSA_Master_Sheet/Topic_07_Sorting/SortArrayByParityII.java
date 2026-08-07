package DSA_Master_Sheet.Topic_07_Sorting;
/*
    * Problem Name: Sort Array by Parity
    * Difficulty: Easy , Level 2/5
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIdx = 0 , oddIdx = 0;
        int [] evenArr = new int[n/2];
        int [] oddArr = new int[n/2];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 == 0){
                evenArr[evenIdx++] = nums[i];
            }else oddArr[oddIdx++] = nums[i];
        }
        evenIdx = 0;
        oddIdx =0;
        for(int i = 0 ; i<n;i++){
            if(i%2==0) nums[i] = evenArr[evenIdx++];
            else nums[i] = oddArr[oddIdx++];
        }
        return nums;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
