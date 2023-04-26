
/*
Create a test or Main class that
• creates an instance of the previous class
• uses the instance with the class methods to:
o add at least 3 key/value pairs to the HashMap
o display all of the key/value pairs
o remove one of the key/value pairs
o display the key/value pairs again
 */

public class Main {

    public static void main(String[] args) {
        hachs tester = new hachs();
        tester.addLetterAndNumber("a",1);
        tester.addLetterAndNumber("b",2);
        tester.addLetterAndNumber("c",3);
        tester.display();
        tester.removeLetter("b");
        tester.display();


    }
}
