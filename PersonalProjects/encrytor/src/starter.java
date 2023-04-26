import java.util.*;
import java.io.*;

import imports.*;

import javax.swing.*;

//

public class starter {

    public void details(){
        String Made_by = "Ethan Buckner";
        String For_The_Purpose_of = "I got bored and maybe a little inebriated";
        String Attributes = "starter";
        double Mk = 0.32;
        String Last_Update = "2/28/2023 9:10 PM";
    }

    public static void main(String[] args) throws IOException {
    String temp1; String temp2; String temp3; String string; String temp4;String temp5;
    int n;
        temp1 = JOptionPane.showInputDialog("SIN File Decryptor and Encryptor\nMade By: Ethan Buckner\n\nYour options are\n\ndecrypt-d\nencrypt-e");
        newString creation = new newString();
        switch (temp1) {

            case ("decrypt"):
            case ("d"):

                try {
                    temp2 = JOptionPane.showInputDialog("Please put in the pathname without drive name\nSuch as this: \"C:\\Users\\...\"\nGet rid of the C\\: and the\"s !");
                    File file = new File(temp2);
                    PrintWriter decryptedFile = new PrintWriter("COSd-File.txt");
                    System.out.println("\"" + temp2 + "\"");
                    decryption decrypt = new decryption(file);
                    decrypt.scanFile(decryptedFile);

                } catch (FileNotFoundException e) {
                    temp2 = JOptionPane.showInputDialog("Could not find file :(");  //Add a way to re-do the file finding tool
                }
                break;

            case ("encrypt"):
            case ("e"):

                temp4 = JOptionPane.showInputDialog("(y/n) do you have a file to encrypt?");
                if (temp4.equals("y")) {
                    try {
                        temp5 = JOptionPane.showInputDialog("Please put in the pathname without drive name\\nSuch as this: \\\"C:\\\\Users\\\\...\\\"\\nGet rid of the C\\\\: and the\\\"s !");
                        File file = new File(temp5);
                        PrintWriter decryptedFile = new PrintWriter(temp5+".SIN");
                        creation.attach2(file);
                        creation.justEncrypt(decryptedFile);

                    }catch(FileNotFoundException e){
                        System.err.println("File was not found");
                    }
                } else {
                    temp3 = JOptionPane.showInputDialog("File will be called what?");
                    PrintWriter file = new PrintWriter(temp3 + ".SIN");
                    File balls = new File(temp3 + ".SIN");
                    n = Integer.parseInt(JOptionPane.showInputDialog("How many lines?"));
                    System.out.println("running through encrcvpt for");
                    for (int i = 0; i <= (n - 1); i++) {
                        string = JOptionPane.showInputDialog("Message on line " + (i + 1) + ": ");
                        creation.attach(string, balls);
                        creation.encryptAndCreate(file, balls);
                    }
                    file.close();
                    break;
                }//end of else

                case("debug"):
                    //add some screen where I can include hacking tools and stuff; that would be badass af frfr

        }//end of switch


    }//end of main

}
