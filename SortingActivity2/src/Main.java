
/*

In the Main class :
• create an instance of the Sorting class
• use the Sorting instance to call getArray() and save its returned unsorted array in a
variable
• print the unsorted array
• use the Sorting instance to call sortArray(), using the unsorted array as an argument to its
parameter, saving its returned sorted array in a variable
• print the sorted array

 */

import java.util.Arrays;

public class Main {

    public static void main(String args[]){


        Sorting sorter = new Sorting();
        int[] temp = sorter.getArray();
        System.out.println("Unsorted array: "+ Arrays.toString(temp));
        int[] temp2 = sorter.sortArray(temp);
        System.out.println("Sorted array: "+ Arrays.toString(temp2));

    }
}
