import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Battle {

    public static void main(String[] args) throws IOException {
        String temp1="";String temp2="";String temp3="";
        double[] attributes = new double[5];
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Do you want to put in your own pokemon info?");
        temp1 = keyboard.nextLine();
        if(temp1.equals("yes")){
            //yeppers
        } else if(temp1.equals("no")) {
            //naw
            System.out.println("What pokemon?");
            temp1 = keyboard.nextLine();
            attributes = getAttributes(temp1);
            System.out.println(attributes[0]+" - "+attributes[1]+" - "+attributes[2]+" - "+attributes[3]+" - "+attributes[4]+" - "+attributes[5]+" - "+attributes[6]);
        }
    }





    public static double[] getAttributes(String pokemonName)throws IOException{
    double[] attributes1 = new double[7];   //name,atk,def,spd,satk,sdef,luck,type
        try {
            File pokemonName1 = new File(pokemonName);
            Scanner input = new Scanner(pokemonName1);
            for (int i = 0; i < 5; i++) {
                attributes1[i] = Integer.parseInt(input.nextLine());
            }
            attributes1[6] = Integer.parseInt(input.nextLine());
            input.close();
        }catch(FileNotFoundException e){
            System.err.println("File not found :(");
        }
        return attributes1;
    }       //make another function to find out the type

}
