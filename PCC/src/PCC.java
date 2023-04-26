import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import imports.*;


/*

Some insight:

PCC was a tool I made in Middle/High school, It was used to do basic functions but could easily
be used to do alot of damage aswell; I used this program as a "hacking" tool, because I always
have loved hackers in games in movies; irl though, 'hacks', like me, don't do cool stuff often :(

 */


public class PCC {
    public static void main(String[] args){
        JFrame screenFrame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size
        screenFrame.setUndecorated(true);
        ImageIcon image = new ImageIcon("src/imports/Hacknet-Hand.jpg");
        JLabel lbl = new JLabel(image);
        screenFrame.getContentPane().add(lbl);
        screenFrame.setSize(image.getIconWidth(), image.getIconHeight());

        int x = (screenSize.width - screenFrame.getSize().width)/2;
        int y = (screenSize.height - screenFrame.getSize().height)/2;

        screenFrame.setLocation(x, y);
        screenFrame.setVisible(true);


    }

}
