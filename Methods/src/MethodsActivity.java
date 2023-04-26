import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
• getLength
o asks the user to enter the rectangle’s length and return the value as a double

• getWidth
o asks the user to enter the rectangle’s width and return the value as a double

• getArea
o accepts the length and width as arguments and returns the rectangle’s area (l * w)
as a double.

• displayData
o accepts the length, width, and area as arguments and displays each on a separate
line with label


 */


public class MethodsActivity {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        double length=0;double width=0;double area=0;
//length,width,area
    length = getLength();
    width = getWidth();
    area = getArea(length,width);
    displayData(length,width,area);

        keyboard.close();
    }

    public static double getLength(){
     System.out.println("What's the length of the Rectangle?");
     return Integer.parseInt(keyboard.nextLine());
    }
    public static double getWidth(){
        System.out.println("What's the Width of the Rectangle?");
        return Integer.parseInt(keyboard.nextLine());
    }
    public static double getArea(double length, double width){
        return (length*width);
    }
    public static void displayData(double length, double width, double area){
        System.out.println("Length: "+length+"\nWidth: "+width+"\nArea: "+area);
    }
}
