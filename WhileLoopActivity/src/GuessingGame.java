import java.util.Random;
import java.util.Scanner;

/*
Write a guessing game that:
• asks the user to guess a number between 1 and 100
o or to enter “q” to quit the game
• uses a while loop to allow the user to enter a number an indefinite amount of times
• informs the user if the number is too high or too low
• informs the user if he guessed correctly
• prints the number of guesses it took the user to get the right number
• informs the user what the number was if he quits
 */

public class GuessingGame {

    public static void main(String[] args){
        int randomInt = randomNum(1,100);
        String input;
        int guessAmt = 0;
        Scanner keyboard = new Scanner(System.in);
        randomInt = randomNum(1,100);
        System.out.println("Guess a number 1 - 100; enter q to quit");
        input = keyboard.nextLine();
        if(input.equals("q")){
            System.out.println("The number was: "+randomInt);
            System.exit(0);
        }
        int inputNum = Integer.parseInt(input);
        while(inputNum!=randomInt){
            if(inputNum>randomInt){
                guessAmt+=1;
                System.out.println("Lower\nGuess again: ");
                inputNum=keyboard.nextInt();
            } else if(inputNum<randomInt){
                guessAmt+=1;
                System.out.println("Higher\nGuess again: ");
                inputNum=keyboard.nextInt();
            } else if(inputNum==randomInt){
                break;
            }
        }

        System.out.println("You did it!\nIt took you: "+guessAmt+" times!");

    }


    static int randomNum(int min, int max){     //function that uses random
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1)  + min;
        return randomNumber;
    }

}
