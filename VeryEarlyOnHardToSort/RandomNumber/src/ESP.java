import java.util.Scanner;
import java.util.Random;


/*
Write a program that tests your ESP (extrasensory perception).
The program should randomly select a color by generating a random number between 0 and 4,
with each number representing a different color:
• 0 = red
• 1 = green
• 2 = blue
• 3 = orange
• 4 = yellow
The program should then ask the use to enter the color that the computer has selected.
After the user’s guess has been entered, program should display the randomly selected color.
The program should repeat this 10 times, then display the number of times the user correctly
guessed the color.

TL;DU make a program that randomly selects a color then have the user guess that color 10 times, then say how many times the user guessed correctly
 */

public class ESP {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int input1, randomInt, attemptAmountRight=0, attemptAmount=0;
    String color="";
    String pigs="walk";

        System.out.println("How many times do you want to guess? (10)");
        input1=Integer.parseInt(keyboard.nextLine());

        for(int i=1;i<=input1;i++){
            randomInt = randomNum(0,4);
            if(randomInt==0){
                color="red";
            } else if(randomInt==1){
                color="green";
            } else if(randomInt==2){
                color="blue";
            } else if(randomInt==3){
                color="orange";
            } else if(randomInt==4){
                color="yellow";
            } else {
                System.out.println("Error1 - randomInt choosing color broke - fix this before shipping Ethan");
            }

            System.out.println("Guess what color I'm thinking!");
            System.out.println("Red, Green, Blue, Orange, or Yellow!"+color);
            String input2 = keyboard.nextLine();
            input2.toLowerCase();

            if(input2.equals(color)){
                attemptAmount+=1;
                attemptAmountRight+=1;
                System.out.println("You got it!");
            } else{
                attemptAmount+=1;
                System.out.println("Nope! Switching the color...");
            }

        }
        System.out.println("You guessed: "+attemptAmountRight+" right!");
        System.out.println("You tried: "+attemptAmount+" total");
        System.exit(0);

    }


    static int randomNum(int min, int max){     //function that uses random
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1)  + min;
        return randomNumber;
    }

}


