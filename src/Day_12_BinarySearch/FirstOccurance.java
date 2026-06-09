package Day_12_BinarySearch;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int n = arr.length , lo = 0 , hi = n-1;
        int target =10 , index =-1;
        while (lo <= hi){
            int mid = (lo + hi)/2;
           if (arr[mid]>target) {
               hi = mid - 1;
           }
           else if (arr[mid] < target){
               lo = mid+1;
           } else if (arr[mid]== target) {
               index = mid;
               hi = mid -1;
           }
        }
        System.out.println("The First position is : "+ index);
    }
}
