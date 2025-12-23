package Day_04_Arrays;

public class RevArray {
    public static void main (String[] args){
        int[] arr = { 10 , 25 , 59 , 71 , 43 };
        int right = arr.length - 1;
        int left = 0;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++ ;
            right-- ;
        }
        for( int num : arr){
            System.out.print( num +" ");
        }

    }
}
