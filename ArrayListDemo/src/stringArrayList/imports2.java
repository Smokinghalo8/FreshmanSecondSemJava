package stringArrayList;

import java.io.*;
import java.util.*;

public class imports2 {

    private ArrayList<String> courseName = new ArrayList<>();
    private ArrayList<Double> gpa = new ArrayList<>();
    private ArrayList<Integer> score = new ArrayList<>();
    private ArrayList<Character> gradeLetter = new ArrayList<>();


    public void newLine(String Coursename ,double GPA, int Score, char GradeLetter){
            courseName.add(Coursename);
            gpa.add(GPA);
            score.add(Score);
            gradeLetter.add(GradeLetter);
    }

    public void print(){//make it go sideways, it's easier and the only way I know how to do it ..://
        String temp1="",temp2="",temp3="",temp4="";

        for(String courseNames:courseName){
            temp1=temp1+courseNames+", ";
        }
        for(double GPAs:gpa){
            temp2=temp2+GPAs+", ";
        }
        for(int Scores:score){
            temp3=temp3+Scores+", ";
        }
        for(char gradeLetters:gradeLetter){
            temp4=temp4+gradeLetters+", ";
        }
        System.out.println("Course Names: "+temp1);
        System.out.println("GPAs: "+temp2);
        System.out.println("Scores: "+temp3);
        System.out.println("Grade Letters: "+temp4);
    }


}
