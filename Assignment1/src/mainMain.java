import java.util.Scanner;
import javax.swing.JOptionPane;


/*
Assignment1
Ethan Buckner
1/17/2023
 */

public class mainMain {

    public static void main(String[] args) {
        String name;
        String nameUp;
        String nameDown;
        String nameR="";
        char interval;
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What's your name? ");
        name = keyboard.nextLine();
        nameUp = name.toUpperCase();
        nameDown = name.toLowerCase();
        for (int i =0; i<name.length(); i++) {
            interval=name.charAt(i);
            nameR = interval+nameR;
        }
        System.out.println(name+", "+nameUp+", "+nameDown+", "+nameR);


        nameR="";        //Has to be reset to nothing
        name=JOptionPane.showInputDialog("Enter name");
        System.out.println("test");
        nameUp = name.toUpperCase();
        nameDown = name.toLowerCase();
        for (int i =0; i<name.length(); i++) {
            interval=name.charAt(i);
            nameR = interval+nameR;
        }

        JOptionPane.showMessageDialog(null, name);
        JOptionPane.showMessageDialog(null, nameUp);
        JOptionPane.showMessageDialog(null, nameDown);
        JOptionPane.showMessageDialog(null,nameR);


        Double number1;
        Double number2;
        System.out.println("Number1:");
        number1 = keyboard.nextDouble();
        System.out.println("Number2:");
        number2 = keyboard.nextDouble();
        System.out.println("Addition = "+number1+number2);
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = "+number1*number2);
        System.out.println("Division = "+number1/number2);
        System.out.println("Sqrt1; "+Math.sqrt(number1)+" Sqrt2; "+Math.sqrt(number2));
        System.out.println("Power: "+Math.pow(number1,number2));
        System.out.println("Fist Log: "+Math.log(number1)+" Second Log: "+Math.log(number2));






        number1=Double.parseDouble(JOptionPane.showInputDialog("Enter 1:"));
        number2=Double.parseDouble(JOptionPane.showInputDialog("Enter 2:"));
        //add, subtract, multiply,divide,sqrt,power,log
        JOptionPane.showMessageDialog(null,number1+number2);
        JOptionPane.showMessageDialog(null,number1-number2);
        JOptionPane.showMessageDialog(null,number1*number2);
        JOptionPane.showMessageDialog(null,number1/number2);
        JOptionPane.showMessageDialog(null,"first: "+Math.sqrt(number1)+", Second: "+Math.sqrt(number2));
        JOptionPane.showMessageDialog(null,Math.pow(number1,number2));
        JOptionPane.showMessageDialog(null,"first: "+Math.log(number1)+", Second: "+Math.log(number2));




    }



}
