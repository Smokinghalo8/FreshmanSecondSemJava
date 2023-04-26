
/*
In the Sorting class:
• create a method getArray() that
o asks the user to enter 5 unsorted integers
o adds the integers to an array
o returns the unsorted array

• create a method sortArray() that
o takes an array of integers as a parameter
o uses one of the 2 sorting algorithms (bubble or merge) to sort the array
o returns the sorted array
o write only the code you need for the algorithm to work—don’t use any of the
example code that prints anything—it should only sort and return the array


 */

import java.util.Scanner;

public class Sorting {
    Scanner keyboard = new Scanner(System.in);
    public int[] getArray(){
        System.out.println("Give 5 random, unsorted numbers, press enter after each number:");
        int temps = Integer.parseInt(keyboard.nextLine());
        int temps2 = Integer.parseInt(keyboard.nextLine());
        int temps3 = Integer.parseInt(keyboard.nextLine());
        int temps4 = Integer.parseInt(keyboard.nextLine());
        int temps5 = Integer.parseInt(keyboard.nextLine());
        int[] temp1 = {temps,temps2,temps3,temps4,temps5};
        return temp1;
    }

    public int[] sortArray(int[] bacon){
        int temp = 0;
        for(int i=0;i<bacon.length-1;i++){
            for(int index=0;index<bacon.length-1;index++){
                if(bacon[index]<bacon[index+1]){
                    temp=bacon[index];
                    bacon[index]=bacon[index+1];
                    bacon[index+1]=temp;
                }
            }
        }
        return bacon;
    }


}



