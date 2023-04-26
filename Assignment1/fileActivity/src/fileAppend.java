import java.io.*;
import java.util.Scanner;

/*
4. Create a class FileAppend that
• asks the user for more values
• writes the values to the existing text file

 */

//ADDS TO input.txt

public class fileAppend {
    public static void main(String[] args)throws IOException{
        String temp1=""; String temp2="";
        int tempNum1=0;

        try{
            FileWriter fileWriter = new FileWriter("input.txt",true);
            PrintWriter output = new PrintWriter(fileWriter);
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Animal:");
            temp1=keyboard.nextLine();
            System.out.println("Age of Animal:");
            tempNum1=Integer.parseInt(keyboard.nextLine());
            output.print("\n"+temp1+" "+tempNum1);
            output.close();
            fileWriter.close();
        }catch(FileNotFoundException e){
            System.err.println("File Not Found :(");
        }

    }

}
