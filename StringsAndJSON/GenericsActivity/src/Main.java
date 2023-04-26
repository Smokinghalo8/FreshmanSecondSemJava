
/*
In the Main class:
• Make an instance of the GenericMethods class.
• Rewrite the assignment example’s arrays of 4 different types as ArrayLists of 4 different
types.
o You can initialize (assign values to) the ArrayLists using Arrays.toList() (see
Week 7’s Activity → Activity 17).
• Use the instance of the GenericMethods class to call the method printArrayList() 4
times, using each of the 4 different types of ArrayLists
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        GenericMethods tester = new GenericMethods();

        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Carrot","Apple","Potato","Pear","Orange"));
        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(1.2, 0.1, 82.2, 30.12, 5.0));
        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('a','b','c','d','e'));
        tester.printArrayList(intArray);
        tester.printArrayList(stringArray);
        tester.printArrayList(doubleArray);
        tester.printArrayList(charArray);


    }

}
