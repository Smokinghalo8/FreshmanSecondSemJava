import java.io.*;
import java.util.*;

import imports.*;


/*
Create a class array and write code similar to the example of populating arrays from
input on page 4 of the assignment

 It should have at least 3 arrays
o There should be arrays of at least 2 different types (String and int, for example)
o Each array should have a length of at least 3 elements.
 Populate the arrays by asking for user input.
 Print the arrays’ contents in a table with headers.
o See the last example in the assignment pdf
 */


public class arrayActivity {

    public static void main(String[] args){
        String[] bleh1 = new String[3];
        int[] bleh2 = new int[3];
        String S1;String S2;String S3;
        int I1; int I2; int I3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First String");
        S1 = keyboard.nextLine();
        System.out.println("Second String");
        S2 = keyboard.nextLine();
        System.out.println("Third String");
        S3 = keyboard.nextLine();
        System.out.println("First Integer");
        I1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Second Integer");
        I2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Third Integer");
        I3 = Integer.parseInt(keyboard.nextLine());

    ArrayFromInput bleh = new ArrayFromInput(S1,S2,S3,I1,I2,I3);
    bleh1 = bleh.attachStrings();
    bleh2 = bleh.attachInt();
    System.out.println(bleh1[0]+" "+bleh1[1]+" "+bleh1[2]);
    System.out.println(bleh2[0]+" "+bleh2[1]+" "+bleh2[2]);



    }

}
