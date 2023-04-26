import java.io.*;
import java.util.*;
import Inheritance.*;

/*
In the inheritance package, create:
• a superclass
o with at least 3 instance variables
• 2 subclasses
o with at least 1 new instance variable each
• Each class should have:
o instance variables mentioned above
o setters and getters
o a toString() method
 */

public class spark {

    public static void main(String args[]){

        genericPerson person1 = new genericPerson("bob",24,41);
        student person2 = new student("sally",15,2,3.5);
        worker person3 = new worker("joe", 57, 78, 34546);


        person1.displayinfo();
        person2.displayinfo();
        person3.displayinfo();

    }

}
