package Day_10_Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int [] arr = {15 , 89 , 6 , 74 , 200 ,555 , 78};
        System.out.println( "Max element is: "+ maxElement(arr));
        System.out.println( "Min element is: "+ minElement(arr));

    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for (int i=0 ; i < arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int minElement(int [] arr){
        int min = arr[0];
        for (int i =0 ; i< arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
