
/*
In the GenericMethods class:
• Rewrite the assignment example generic method printArray() as the new generic method
called printArrayList().
• The printArrayList() method should have a parameter of an ArrayList of any type and
print out all the elements in the Arraylist.
 */

import java.util.ArrayList;

public class GenericMethods {

    public <E> void  printArrayList(ArrayList<E> inputArray){
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


}
