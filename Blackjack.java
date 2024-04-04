import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    static Scanner keyboard = new Scanner(System.in);
    static Random myRan = new Random();

    public static void main(String[] args) {

        int computerWins = 0;
        int userWins = 0;
        String winner;
        String playAgain;


        do {
            winner = playBlackJack();
            if (winner.equalsIgnoreCase("computer")) {

                computerWins++;
            } else if (winner.equalsIgnoreCase("user")) {

                userWins++;
            }

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = keyboard.nextLine();


        }

        while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("User won " + userWins + " times.");
        System.out.println("Computer won " + computerWins + " times.");
    }

    public static String playBlackJack(){

        int computerPoints = 0;
        int userPoints = 0;
        int cardValue = 0;
        String anotherCard;
        String winner = "";

        do{

            cardValue = myRan.nextInt(11) + 1;
            computerPoints += cardValue;
            cardValue = myRan.nextInt(11) + 1;
            userPoints += cardValue;

            System.out.println("User has " + userPoints + " points so far.");
            System.out.println("Do you want another card? (yes / no)");
            anotherCard = keyboard.nextLine();
            System.out.println("Computer has " + computerPoints + " points so far.");

        }

        while (userPoints < 21 && computerPoints < 21 && anotherCard.equalsIgnoreCase("yes"));

            if (userPoints == 21){

                winner = "User wins!";
                System.out.println(winner);
            }

            else if (computerPoints == 21){

                winner = "Computer wins!";
                System.out.println(winner);
            }

            else if (userPoints > 21 && computerPoints < 21){

                winner = "Computer wins!";
                System.out.println(winner);
            }

            else if (computerPoints > 21 && userPoints < 21){

                winner = "User wins!";
                System.out.println(winner);
            }

            else if ((userPoints > computerPoints) && userPoints < 21){

                winner = "User wins!";
                System.out.println(winner);
            }

            else if ((computerPoints > userPoints) && computerPoints < 21){

                winner = "Computer wins!";
                System.out.println(winner);
            }

            else {

                System.out.println("Tie!");
            }



            return winner;

    }
}
