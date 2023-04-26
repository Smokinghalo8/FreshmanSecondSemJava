import java.util.*;

/*
In Test class:
• create the main() method, and in it:
• create an instance of the BigO class
• use the instance of the class to call the 3 methods from the class
 */


public class test {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        bigO testExample = new bigO();

        testExample.printOnce();
        System.out.println("How many times do you want the statement to be printed?");
        int temp1 = Integer.parseInt(keyboard.nextLine());
        testExample.printNTimes(temp1-1);
        System.out.println("How many times do you want the statement to be printed Squared?");
        int temp2 = Integer.parseInt(keyboard.nextLine());
        testExample.printNSquaredTimes(temp2-1);


    }
}
