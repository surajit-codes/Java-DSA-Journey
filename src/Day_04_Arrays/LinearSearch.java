package Day_04_Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int[] num = {10, 50, 30, 70, 80, 20};
        int guess;
        boolean isFound = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        guess = sc.nextInt();
        for(int i = 0 ; i < num.length ; i++){
            if(guess == num[i]){
                System.out.println("The no found at index "+i);
                isFound = true;
                break;
            }
        }
            if( !isFound ) {
                System.out.println("NOT FOUND !");
            }

        sc.close();
    }
}
