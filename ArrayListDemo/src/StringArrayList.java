import stringArrayList.imports;

import java.io.*;
import java.util.*;

/*
Create a new Java project arrayListDemo.
Create a new package stringArrayList.
Create a class StringArrayList with an ArrayList of strings.
Write methods similar to the assignment’s example scores methods
 add Strings to the list
 remove strings from the list
 get the size of the list
 get an element by index
 display the list elements using
o the for each loop
o regular for loop

------------
//BY INDEX ITS WHERE IN THE ARRAY IT IS AT
------------
Write a test class and run all of the methods.


Create a new package classArraylists.
Create a new class CourseInfo that uses the ArrayLists from the assignment with
 a method that adds a new items to each list
 a method that prints the class info as a table
o with headers for Course Name, GPA, Score, Letter Grade
Create a test class that prompts the user to enter info for courses (course name, gpa, score, letter
grade) or “q to quit”. When “q” is entered, the course info table should be printed to the console.
Zip the project folder and submit to Canvas.
 */

import java.util.ArrayList;

public class StringArrayList {

    public static void main(String[] args){
        int parsedNumber2=10;
        imports temporary = new imports();

        for(int parsedNumber=0;parsedNumber<parsedNumber2;parsedNumber++) {
                    parsedNumber2++;

            String temp1 = "";
            int tempI1 = 0;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What would you like to do?\nadd\nremove\nget\nsize\ndisplay");
            temp1 = keyboard.nextLine();

            switch (temp1) {

                case ("add"):
                    System.out.println("What Word do you want to add?");
                    temp1 = keyboard.nextLine();
                    temporary.add(temp1);
                    break;
                case ("remove"):
                    System.out.println("What Word do you want to remove?");
                    temp1 = keyboard.nextLine();
                    temporary.remove(temp1);
                    break;
                case ("get"):
                    System.out.println("What's the index value of what you want to get?");
                    tempI1=Integer.parseInt(keyboard.nextLine());
                    temp1 = temporary.get(tempI1);
                    System.out.println(temp1);
                    break;
                case ("size"):
                    tempI1 = temporary.size();
                    System.out.println(tempI1);
                    break;
                case ("display"):
                    temporary.display();
                    break;

            }
        }
    }



}
