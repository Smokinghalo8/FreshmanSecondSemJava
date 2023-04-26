import java.io.*;
import java.util.*;

/*
Ethan Buckner

Create 3 classes: ArrayDemo1, ArrayDemo2, and ArrayDemo3.
In the first 2 classes:
 Create two 4 dimensional arrays of ints (at least 3 elements in each inner array)—one
array for each class.

 Use the two different methods of declaration and initialization, one for each array.
o See page 2 of the assignment for the 2 different methods.
 Print the array elements to the console using the for each method for one array and the
regular for loop for the other.

In the third class, create a 2 or 3 dimensional array of strings and print it to the console using
either of the for loops.


Submit all 3 .java files to Canvas.
 */




public class ArrayDemo1 {




    public static void main(String[] args){

        int[][] temp1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12}};

        //System.err.println("This is for Array1");
        //array1
        for(int[] row : temp1){
            for(int column : row){
                System.out.println(column);
            }
        }





        //System.err.println("This is for Array2");
        //array2



    }

}
