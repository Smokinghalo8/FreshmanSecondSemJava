import java.util.*;

/*
in the Main class:
• create an instance of the StudentSet class
• call the addStudents() method
• call the displayStudents() method
 */



public class Main {
    public static void main(String args[]) {

        StudentSet Stud = new StudentSet();
        Set<String> temp = Stud.addStudents();
        Stud.displayStudents(temp);


    }
}
