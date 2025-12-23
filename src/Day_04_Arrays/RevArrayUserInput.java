package Day_04_Arrays;

import java.util.Scanner;

public class RevArrayUserInput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        arr = new int[size];
        for(int i = 0 ; i < size ; i ++){
            System.out.print("Enter element for " + (i+1) + " place : ");
            arr[i] = sc.nextInt();
        }
        int right = arr.length - 1;
        int left = 0;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++ ;
            right-- ;
        }
        for(int j = 0 ; j < size ; j++){
            System.out.print(arr[j] +" ");
        }
        sc.close();
    }
}
