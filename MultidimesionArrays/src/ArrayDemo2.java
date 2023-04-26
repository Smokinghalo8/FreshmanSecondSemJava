import java.io.*;
import java.util.*;
public class ArrayDemo2 {

public static void main(String[] args){


    int[][] temp2 = new int[5][3];
    temp2[0][0] = 1;
    temp2[0][1] = 2;
    temp2[0][2] = 3;
    temp2[1][0] = 4;
    temp2[1][1] = 5;
    temp2[1][2] = 6;
    temp2[2][0] = 7;
    temp2[2][1] = 8;
    temp2[2][2] = 9;
    temp2[3][0] = 10;
    temp2[3][1] = 11;
    temp2[3][2] = 12;

    for(int i=0; i<temp2[i].length+1 ; i++){
        for(int j=0 ; j<temp2[i].length ; j++){
            System.out.println(temp2[i][j]);
        }
    }


}


}
