import org.w3c.dom.Node;

import java.util.*;

/*
In the Student class create:
• instance variables
o first name
o last name
o ID
o major
o class standing (Freshman, Soph, etc.)
o gpa
o courseList

▪ a LinkedList of the student’s courses
• use only the names of the courses as Strings
▪ use the LinkedList imported from java.util.LinkedList
• see page 1 & 2 of the LinkedList Assignment pdf
• constructor

o parameters
▪ first name, last name, ID, major, class standing

• methods
o addCourse()
▪ adds a course to the courseList LinkedList

o removeCourse()
▪ removes a course from the courseList LinkedList

o getStudentInfo()
▪ returns a String of student info

o displayStudentCourses()
▪ prints each course name from courseList
 */

public class Student {

    private String firstName;
    private String lastName;
    private Integer ID;
    private String major;
    private String classStanding;
    private Double gpa;
    private LinkedList<String> courseList = new LinkedList<>();
    private Node nextNode;
    private Object item;
    private int size;

    public Student(){
        /*
        firstName = null;
        lastName = null;
        ID = null;
        major = null;
        classStanding = null;
        gpa = null;
        nextNode = null;
        this.item = null;
        this.size = null;

         */
    };

    public Student(String firstName, String lastName, Integer ID, String Major, String classStanding, Double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = Major;
        this.classStanding = classStanding;
        this.gpa=gpa;
    }

    public void addCourse(String add){
        courseList.add(add);
        this.size++;
    }

    public void removeCourse(String remove){
        if(courseList.contains(remove)){
            courseList.remove(remove);
            this.size--;
        } else{
            System.err.println(remove+" was not found in the list");
        }
    }

    public String display(){
        return ("First Name: "+this.firstName+"; Last Name: "+this.lastName+"; ID: "+this.ID+"; Major: "+this.major+"; Class Standing: "+this.classStanding+"; GPA: "+this.gpa+"; Courses: "+courseList);
    }

    public void displayStudentCourse(){
        for(int i =0; i<=this.size-1; i++){
            System.out.println(i+". "+courseList.get(i));
        }

    }

}
