
/*
In the Main class create:
• a main method

• in the main, create 2 instances of the Student class
o use appropriate argument values for the constructor parameters (name, id, etc.)

• for each Student instance:
o add 3 or 4 classes to the course list
o print the student’s info
o print the student’s course list
o remove 1 course
o print the course list again
 */


public class Main {

    public static void main(String[] args){
    Student student1 = new Student("Jill", "Sven", 123456, "Art", "Freshman", 2.5);
    Student student2 = new Student("Billy", "Eyelash", 654321, "Computer Science", "Senior", 3.6);

    student1.addCourse("ART101");
    student1.addCourse("ART102");
    student1.addCourse("STAT104");
    System.out.println(student1.display());
        System.out.println("_____ Before Removal");
    student1.displayStudentCourse();
    student1.removeCourse("ART101");
        System.out.println("_____ After Removal");
        student1.displayStudentCourse();

        student2.addCourse("CS402");
        student2.addCourse("CS106");
        student2.addCourse("STAT205");
        System.out.println(student2.display());
        System.out.println("_____ Before Removal");
        student2.displayStudentCourse();
        student2.removeCourse("CS106");
        System.out.println("_____ After Removal");
        student2.displayStudentCourse();
    }

}
