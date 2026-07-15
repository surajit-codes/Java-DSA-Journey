package Daily_Learning.Day_12_BinarySearch;

public class OccuranceCount {
    static int firstOccurance(int[] arr , int target){
        int lo = 0 , hi = arr.length -1;
        int  index =-1;
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
        return index;
    }
    static int lastOccurance(int[]arr , int target){
        int lo = 0 , hi = arr.length -1;
        int  index =-1;
        while (lo <= hi){
            int mid = (lo + hi)/2;
            if (arr[mid]>target) {
                hi = mid - 1;
            }
            else if (arr[mid] < target){
                lo = mid+1;
            } else if (arr[mid]== target) {
                index = mid;
                lo = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        int first = firstOccurance(arr, target);
        if (first == -1) {
            System.out.println("Total Occurance is : 0");
        } else {
            int last = lastOccurance(arr, target);
            int count = last - first + 1;
            System.out.println("Total Occurance is : " + count);
        }

    }

}
