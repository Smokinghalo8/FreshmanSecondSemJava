import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Name:Ethan Buckner
Date:1/18/2023
Write a program that has variables to hold three test scores.
The program should ask the user to enter 3 test scores and assign the values entered to the
variables.
The program should
• print the average of the test scores
• print the letter grade for the test score average
 */

public class TestScores {
    public static void main(String[] args){
        String score1,score2,score3,avarageScore;
        double score;

        score1=JOptionPane.showInputDialog("Test Score 1: ");
        score2=JOptionPane.showInputDialog("Test Score 2: ");
        score3=JOptionPane.showInputDialog("Test Score 3: ");

        Math.round(score=(Integer.parseInt(score1)+Integer.parseInt(score2)+Integer.parseInt(score3))/3);

        JOptionPane.showMessageDialog(null,score);

        if(score >=90){
            JOptionPane.showMessageDialog(null, "A");
            System.exit(0);
        }
        else if(score >=80 && score <= 89){
            JOptionPane.showMessageDialog(null,"B");
            System.exit(0);
        }
        else if(score >= 70 && score <= 79){
            JOptionPane.showMessageDialog(null,"C");
            System.exit(0);
        }
        else if(score >= 60 && score <= 69){
            JOptionPane.showMessageDialog(null, "D");
            System.exit(0);
        }
        else {
            JOptionPane.showMessageDialog(null,"F");
            System.exit(0);
        }


    }

}
