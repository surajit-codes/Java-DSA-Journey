package Daily_Learning.Day_02_Logic_Building;
import java.util.Scanner;
import java.util.Random;

public class GameOneRound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random =new Random();
        String input;
        int value = random.nextInt(1,4);
        System.out.print("Enter (Rock/Paper/Scissors): ");
        input = sc.nextLine();
        if(!input.equalsIgnoreCase("Rock") && !input.equalsIgnoreCase("Paper") && !input.equalsIgnoreCase("Scissors")){
            System.out.println("Wrong Input");
            return;
        }

        if(value==1){
            if(input.equalsIgnoreCase("Rock")){
                System.out.println("computer choose: Rock");
                System.out.println("Ohh! Match draw 😆");
            }
            else if (input.equalsIgnoreCase("Paper")){
                System.out.println("computer choose: Rock");
                System.out.println("You won 🎉");
            }
            else{
                System.out.println("computer choose: Rock");
                System.out.println("You Loss ! 🙃");
            }
        } else if (value == 2) { // paper
            if(input.equalsIgnoreCase("Rock")){
                System.out.println("computer choose: Paper");
                System.out.println("You Loss ! 🙃");
            }
            else if (input.equalsIgnoreCase("Paper")){
                System.out.println("computer choose: Paper");
                System.out.println("Ohh! Match draw 😆");
            }
            else{
                System.out.println("computer choose: Paper");
                System.out.println("You won 🎉");
        }
        } else if (value == 3) { // scissor
            if(input.equalsIgnoreCase("Rock")){
                System.out.println("computer choose: Scissors");
                System.out.println("You won 🎉");
            }
            else if (input.equalsIgnoreCase("Paper")){
                System.out.println("computer choose: Scissors");
                System.out.println("You Loss ! 🙃");
            }
            else{
                System.out.println("computer choose: Scissors");
                System.out.println("Ohh! Match draw 😆");
            }


    }
        sc.close();
}
}
