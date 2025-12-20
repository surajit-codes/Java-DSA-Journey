package Day_01_Basics;
import java.util.Scanner;
public class InputScanner {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hey," + name + " \nglad to see you here.");
        sc.close();
    }
}
