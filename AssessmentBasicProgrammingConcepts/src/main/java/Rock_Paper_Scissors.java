import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rounds;
        Random rand = new Random();
        int AIHand;
        boolean playAgain = true;
        String choice;
        int win=0;
        int tie=0;
        int lose=0;

        do{
            do {
                System.out.println("How many woulds would you like to play (1-10) ");
                rounds = input.nextInt();
            }while(rounds<1||rounds>10);

            for (int i =0; i<rounds;i++){
                System.out.println("1 = Rock, 2 = Paper, 3 = Scissors?");
                int hand = input.nextInt();

                // makes sure user has entered a valid hand
                while (hand>3||hand<1){
                    System.out.println("sorry the options are 1 = Rock, 2 = Paper, 3 = Scissors?");
                    hand = input.nextInt();
                }

                AIHand = rand.nextInt(3)+1;

                //check if a tie or who has won
                if(hand == AIHand){
                    tie++;
                    System.out.println("tie");
                }else if(AIHand == 2 && hand == 3){
                    win++;
                    System.out.println("win");
                }else if(AIHand == 1 && hand == 2){
                    win++;
                    System.out.println("win");
                }else if(AIHand == 3 && hand == 1){
                    win++;
                    System.out.println("win");
                }else{
                    lose++;
                    System.out.println("lose");
                }
            }

            System.out.println("you won " + win + " time lost " + lose +" times and tied " + tie + " times");

            // makes sure user has entered a valid option
            do {
                System.out.println("would you like to go again y/n");
                choice = input.next().toLowerCase();
            }while(!(choice.equals("n")||choice.equals("y")));

            if(Objects.equals(choice, "n")){
                playAgain = false;
                System.out.println("Thanks for playing!");
            }else{
                win=0;
                tie=0;
                lose=0;
            }
        }while(playAgain);
    }
}
