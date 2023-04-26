import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;


/*
3. Create a class FileWrite that
• writes a header for the file
• asks the user for input data
• writes the input under the appropriate headers

 */
public class fileWrite {

    public static void main(String[] args)throws IOException{
        String temp=""; String name="";
        int temp2=1; int age=0;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Do you have animals? (yes or no)");
        temp = keyboard.nextLine();
        if(temp.equals("yes")) {
            try {
                FileWriter fileWriter = new FileWriter("emptyFile");
                PrintWriter output = new PrintWriter(fileWriter);
                        System.out.println("What's their name?");
                        name = keyboard.nextLine();
                        System.out.println("How old are they?");
                        age = Integer.parseInt(keyboard.nextLine());
                        output.print(name+"\n"+age);

                fileWriter.close();
                output.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found :(");
            }
        } else if(temp.equals("no")){
            System.out.println("ahh, okay");
            System.exit(0);
        }


    }

}
