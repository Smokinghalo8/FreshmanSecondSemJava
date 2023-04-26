import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
2. Create a class FileRead that
• has a try/catch statement
• reads the text file
Good
 */

public class fileRead {

    public static void main(String[] args)throws IOException {
        int f = 1;
        File rawFile = new File("input.txt");
        try{
            Scanner file = new Scanner(rawFile);
            while(file.hasNextLine()){
                String line = file.nextLine();
                System.out.println(line+" Line: "+f);       //Debug added line numbers :P
                f++;
            }
            file.close();
        }catch (FileNotFoundException e){
        System.err.println("File not found :(");
        }


    }
}