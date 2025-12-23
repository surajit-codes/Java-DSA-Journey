package Day_04_Arrays;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args){
        String [] cars;
        Scanner sc = new Scanner(System.in);
        cars = new String[5];
        for (int i=0 ; i<5 ; i++){
            System.out.print("Enter the car name: ");
            cars[i] = sc.nextLine();
        }
        for(String car : cars){
            System.out.println(car);
        }
        sc.close();
    }
}
