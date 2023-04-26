import java.util.Scanner;

/*
You have a group of friends coming to visit for your high school reunion, and you want to take
them out to eat at a local restaurant. You aren’t sure if any of them have dietary restrictions, but
your restaurant choices are as follows:

● Joe’s Gourmet Burgers – Vegetarian: No, Vegan: No, Gluten-Free: No
● Main Street Pizza Company – Vegetarian: Yes, Vegan: No, Gluten-Free: Yes
● Corner Café – Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
● Mama’s Fine Italian – Vegetarian: Yes, Vegan: No, Gluten-Free: No
● The Chef’s Kitchen – Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes

Write a program that asks whether any members of your party are vegetarian, vegan, or gluten-
free, and then displays only the restaurants that you may take the group to.
 */


public class RestaurantSelector {

    public static void main(String[] args){
        String preop,op1,op2,op3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do any of your friends have dietary issues?");
        preop = keyboard.nextLine();
        preop = preop.toLowerCase();
        if(preop.equals("yes")){
            System.out.println("Are any of you Vegetarian?");
            op1 = keyboard.nextLine();
            op1 = op1.toLowerCase();
            System.out.println("Are any of you Vegan?");
            op2 = keyboard.nextLine();
            op2 = op2.toLowerCase();
            System.out.println("Are any of you allergic to Gluten?");
            op3 = keyboard.nextLine();
            op3 = op3.toLowerCase();

            if(op1.equals("no")&&op2.equals("no")&&op3.equals("no")){
                System.out.println("You can go here:\nJoe’s Gourmet Burgers\nMain Street Pizza Company\nCorner Café\nMama’s Fine Italian\nThe Chef’s Kitchen");
            } else if(op1.equals("yes")&&op2.equals("no")&&op3.equals("no")){
                System.out.println("You can go here:\nMain Street Pizza Company\nCorner Café\nMama’s Fine Italian\nThe Chef’s Kitchen");
            } else if(op1.equals("yes")&&op2.equals("yes")&&op3.equals("no")){
                System.out.println("You can go here:\nCorner Café\nThe Chef’s Kitchen");
            } else if(op1.equals("yes")&&op2.equals("yes")&&op3.equals("yes")){
                System.out.println("You can go here:\nCorner Café\nThe Chef’s Kitchen");
            } else if(op1.equals("no")&&op2.equals("yes")&&op3.equals("yes")){
                System.out.println("You can go here:\nCorner Café\nThe Chef’s Kitchen");
            } else if(op1.equals("no")&&op2.equals("yes")&&op3.equals("no")){
                System.out.println("You can go here:\nMain Street Pizza Company\nCorner Café\nThe Chef’s Kitchen");
            } else {
                System.out.println("You can go here:\nMain Street Pizza Company\nCorner Café\nThe Chef’s Kitchen");
            }           //no, no, yes





        } else if(preop.equals("no")){
            System.out.println("Ah Good, less work for me.");
            System.exit(0);
        } else{
            System.out.println("You know you aren't supposed to be here, right?");
            System.out.println("Error_1");
        }

    }
    public static void rand(String[] args[a,b]){

}


}
