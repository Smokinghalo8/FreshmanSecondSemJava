import javax.swing.*;
import java.io.*;
import java.util.*;


public class runner {
    public static void main(String[] args){
        int n = 5;
        Scanner keyboard = new Scanner(System.in);
        for(int i=0; i<n; i++) {

            double temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0;
            String tempS1 = "", tempS2 = "";

            System.out.println("nu");
            tempS1=keyboard.nextLine();//nu
            System.out.println("Sample Size");
            tempS2=keyboard.nextLine();//sample size

            temp1 = Double.parseDouble(tempS1);
            temp2 = Double.parseDouble(tempS2);

            temp3 = Math.sqrt((temp1 * (1 - temp1)) / temp2);

            System.out.println(temp3);
            n++;
        }

    }

}
