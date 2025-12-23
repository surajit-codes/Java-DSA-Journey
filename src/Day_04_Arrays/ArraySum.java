package Day_04_Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        int size;
        double [] num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your number: ");
        size = sc.nextInt();
        num = new double[size];
       for(int i = 0 ; i < size ; i ++){
           System.out.print("Enter the no: ");
           num[i] = sc.nextDouble();
       }
        System.out.println( sumOf(num));
        System.out.println(avgOf(num));

        sc.close();
    }
    static double sumOf(double arr[]){
        double sum = 0;
      for (int i = 0 ; i < arr.length ; i++){
          sum += arr[i];
      }
        return sum;
    }
    static double avgOf(double arr[]){
        double sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
