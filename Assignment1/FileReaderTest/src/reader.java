import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
//add these three
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



public class reader {

    public static void main(String[] args)throws IOException{
        try {
            FileWriter fileWriter = new FileWriter("text.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Course Name");
            String credits = JOptionPane.showInputDialog("Course Credits");
            String score = JOptionPane.showInputDialog("Course Score");

            output.printf(course, credits, score);
            fileWriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("File Not Found :(");
        }


    }
}
