import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Name: Ethan Buckner
Assignment 2
1/18/2023

• If a customer purchases 0 books, he or she earns 0 points.
• If a customer purchases 1 book, he or she earns 5 points.
• If a customer purchases 2 books, he or she earns 15 points.
• If a customer purchases 3 books, he or she earns 30 points.
• If a customer purchases 4 or more books, he or she earns 60 points.


 */



public class BookClubPoints {

    public static void main(String[] args) {
    String question;


        question = JOptionPane.showInputDialog("How many books did you buy? ");

        if(question.equals(0)) {
            JOptionPane.showMessageDialog(null,"You get 0 points");
            System.exit(0);
        }
        else if(question.equals(1)) {
            JOptionPane.showMessageDialog(null,"You get 5 Points");
            System.exit(0);
        }
        else if(question.equals(2)){
            JOptionPane.showMessageDialog(null, "You get 15 points");
            System.exit(0);
        }
        else if(question.equals(3)){
            JOptionPane.showMessageDialog(null, "You get 30 points");
            System.exit(0);
        }
        else if(Integer.parseInt(question) >= 4){
            JOptionPane.showMessageDialog(null, "You get 60 points");
            System.exit(0);
        }
        else{
            System.out.println("Error");
        }



    }
}
