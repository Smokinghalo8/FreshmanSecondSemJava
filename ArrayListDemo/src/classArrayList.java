import stringArrayList.imports2;
import java.io.*;
import java.util.*;

/*
 a method that adds a new items to each list
 a method that prints the class info as a table
o with headers for Course Name, GPA, Score, Letter Grade
 */

public class classArrayList {

    public static void main(String[] args) {
        String tempS1 = "",bacontempstring;
        char tempS2;
        int numberParsed2 = 10;
        int temp1=0,temp2;
        double temp1D=0;
        Scanner keyboard = new Scanner(System.in);
        imports2 tempArray = new imports2();


        for (int numberParsed = 0; numberParsed < numberParsed2; numberParsed++) {
            numberParsed2++;

            System.out.println("Functions are:\n\nnew - creates a new table\nprint - prints the table\nq - quit also works, just ends this");
            tempS1 = keyboard.nextLine();
            switch (tempS1) {
                case ("q"):
                case ("quit"):
                    tempArray.print();
                    System.out.println("Now Leaving...");
                    break;
                case ("new")://this will be a new user, so run through... up there
                    System.out.println("Course Name:");
                    tempS1=keyboard.nextLine();
                    System.out.println("GPA:");
                    temp1D=Double.parseDouble(keyboard.nextLine());
                    System.out.println("Score:");
                    temp2=Integer.parseInt(keyboard.nextLine());
                    System.out.println("Letter Grade:");
                    tempS2 = keyboard.nextLine().charAt(0);     //SUPER SMART THANKS INTER WEBS
                    tempArray.newLine(tempS1,temp1D,temp2,tempS2);
                    break;
                case ("print"):
                    tempArray.print();
            }
            break;
        }

    }

}
