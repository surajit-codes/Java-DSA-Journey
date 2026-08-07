package DSA_Master_Sheet.Topic_07_Sorting;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    static int[] mergeSort (int[] arr){
        int n = arr.length;
        if(n<=1) return arr;
        int idx =0;
        int n1 = n/2 , n2 = n - n/2 ;
        int [] arr1 = new int[n1];
        int [] arr2 = new int [n2];
        for( int i = 0 ; i<n1;i++){
            arr1[i] = arr[i];
            idx++;
        }
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = arr[idx++];
        }
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        return mergeArray(arr1 , arr2);
    }
    static int [] mergeArray (int [] arr1 , int[] arr2){
        int i = 0 , j=0 , k =0;
        int n1 =arr1.length , n2 = arr2.length ;
        int n3 = n1+n2;
        int[] arr3 = new int[ n3];
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length) arr3[k++] = arr1[i++];
        while(j<arr2.length) arr3[k++] = arr2[j++];
        return arr3;
    }

    public static void main(String[] args) {
        //FOR TEST CASES.
       /* int[] arr = {32,96,21,85,21,45,85,61,1,20,66};
        int[]arr2 = mergeSort(arr);
        for(int n : arr2){
            System.out.print(n+" ");
        }*/
    }
}
