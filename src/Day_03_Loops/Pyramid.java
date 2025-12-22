package Day_03_Loops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
