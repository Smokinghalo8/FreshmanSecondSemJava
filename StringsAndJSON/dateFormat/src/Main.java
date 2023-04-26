
/*
In the Main class:
• ask the user to enter the amount of calories allowed per day by a diet
• ask the user what date (as mm/dd/yyyy) the diet will start
• ask the user what date (as mm/dd/yyyy) the diet will end
• call the methed in the TotalCalories class to get the total calories consumed during the
diet time period and print the result.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        totalCal yup = new totalCal();
        System.out.println("How many calories can you eat each day? ");
        int temp1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("When will it start? (mm/dd/yyyy)");
        String temp2 = keyboard.nextLine();
        System.out.println("When will it end? (mm/dd/yyyy)");
        String temp3 = keyboard.nextLine();
        System.out.println(yup.totalCalories(temp1,temp2,temp3));


    }


}
