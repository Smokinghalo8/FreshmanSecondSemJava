import java.util.*;

/*
in the StudentSet class create:
• a set called students
• a method called addStudents() that
o asks the user to enter any number of students to the set, or enter q to quit

• a method called displayStudents() that
o creates an Iterator for the students set
o iterates through the set, and while hasNext() is true, prints out the next student in
the set
 */

public class StudentSet {

    Scanner keyboard = new Scanner(System.in);

    Set<String> students = new HashSet<>();

    public Set<String> addStudents(){
        System.out.println("Enter a number of students or press 'q' to quit: ");
        String temp1 = keyboard.nextLine();
        if(temp1.equals("q")){
            return students;
        }
        int temp2 = Integer.parseInt(temp1);
        for(int i=0;i<=temp2-1;i++){
            System.out.println("Enter a name: ");
            String tempString = keyboard.nextLine();
            if(tempString.equals("q")){
                return students;
            }
            students.add(tempString);
        }
        return students;
    }

    public void displayStudents(Set<String> temp){
        Iterator<String> iter = temp.iterator();
        while(iter.hasNext()){
            String temp2 = iter.next();
            System.out.println(temp2);
        }
    }


}
