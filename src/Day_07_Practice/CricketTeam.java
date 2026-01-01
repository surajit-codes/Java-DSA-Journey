package Day_07_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CricketTeam {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       ArrayList <String> player = new ArrayList<>();
       System.out.print("Enter # od player: ");
       int numOfPlayer = sc.nextInt();
       sc.nextLine();
       for (int i = 1 ; i <= numOfPlayer ; i++ ){
           System.out.print("Enter player # " + i + " : ");
           String playerName = sc.nextLine();
           player.add(playerName);
       }
       // The player 3 is injured so have to remove and add new one

       player.remove(2);
       player.add(2 , "Dhoni");
       for(String players : player){
           System.out.println(players);
       }
   }

}
