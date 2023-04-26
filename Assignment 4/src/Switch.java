import java.util.Scanner;
/*
Create a new class SwitchActivity. Using a switch statement, ask the user to enter one item from
at least a list of four and then print out some property of the item. Use one of the examples below
or one of your own.

favorite animal: Dog, cat, fish bird

 */


public class Switch {

    public static void main(String[] args){
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your favorite animal? [Dog, Cat, Fish, Bird]");
        input = keyboard.nextLine();
        input = input.toLowerCase();


        switch(input) {


            case ("dog"):
                System.out.println("Did you know dogs live for 10-13 years?\nSome dogs can Actually live longer though!");
                break;
            case ("cat"):
                System.out.println("Did you know cats live for 12-13 years?\nCats live longer on average than dogs!");
                break;
            case ("fish"):
                System.out.println("Did you know fish live for 25-35 years? Koi of course.\nThat's longer than most dogs!");
                break;
            case ("bird"):
                System.out.println("Did you know birds live for 3-5 years? Cardinals of course.\nI have no idea how this school still exists...");
                break;
        }
    }

}
