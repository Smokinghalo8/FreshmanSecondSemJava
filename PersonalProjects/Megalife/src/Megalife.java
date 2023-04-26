import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

import Imports.*;



public class Megalife {

    class canvas extends JFrame {
        canvas() {
            super("canvas");
            Canvas screen = new Canvas() {
                public void paint(Graphics g) {
                    // set color to red
                    g.setColor(Color.red);

                    // set Font
                    g.setFont(new Font("Bold", 1, 20));

                    // draw a string
                    g.drawString("This is a canvas", 100, 100);
                }
            };

            // set background
            screen.setBackground(Color.black);
            add(screen);
            setSize(400, 300);
            show();

        }
    }
        public static void main(String[] args) {
//1920-1080
            
            Canvas screen = new Canvas();

            System.out.println("b");


        }







            //IMPORT(ED) IMPORTS

}
