import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import imports.*;



public class Dimension {
    public static void main(String[] args) throws FileNotFoundException {
        //initializing yes and no counts as int variables
        double noAttack = 0;
        double attack = 0;
        int countY = 0;
        int countN = 0;
        int countY2 = 0;
        int countN2 = 0;
        //int total = 25192;
        double pos;
        double neg;
        //input KDD-Train dataset
        File file = new File("C:\\Users\\ethan\\Documents\\GitHub\\CS121-S23-Buckner\\KDD\\src\\KDDTrain+_20Percent.txt");
        //scanner input to read contents of the file
        Scanner fileRead = new Scanner(new BufferedReader(new FileReader(file)));
        //setting the rows and columns for the 2 dimensional array as final int variables
        final int rows = 25192;
        final int columns = 43;
        String[][] dataSet = new String[rows][columns];
        //String[] flags = {"SF","REJ","S0","S1","S2","S3","RSTO","RSTR","OTH","RSTOS0","SH","SHR"};
        //file reads each line, and split and trims the commas in the dataset
        while(fileRead.hasNextLine()){
            for(int i = 0;i<dataSet.length;i++){
                //converts each element of the array to a string as well
                String[] line = fileRead.nextLine().trim().split(",");
                for (int j=0; j<line.length; j++){
                    dataSet[i][j] = line[j];
                }
            }
        }
        //System.out.println(Arrays.deepToString(dataSet));
        //gets the ratios of zeroes to non-zeroes (this is temporary;
        // continuous values still need to be converted)
        int colNum;

        //Scanner input = new Scanner(System.in);
        //System.out.println("Column Number(Between 0-42 because of array): ");
        //colNum = input.nextInt();

        //This is the start of what we need to repeat for Every row

        //This needs to be more fleshed out to determin what is an attack, and what is not

         noAttack = 0;
         attack = 0;
        for(int i=0;i < dataSet.length;i++ ){
            String value = dataSet[i][columns - 2];
            if(value.equals("normal")){
                noAttack++;

            }else{
                attack++;


            }
        }
        //prints out the number of attacks to non attacks there are in Feature 4: Flags
        System.out.printf("Attack: %f\nNo Attack: %f\n",attack,noAttack);
        //System.out.printf("Attack2: %d\nNo Attack2: %d\n",countY2,countN2);


        pos = attack/ rows;
        neg = noAttack / rows;
        double entropy = 0 - pos*Math.log(pos)/Math.log(2) - neg*Math.log(neg)/Math.log(2);

        //This needs to be repeated for EVERY ROW



        System.out.printf("Pos: %f\nNeg: %f\nEntropy: %f",pos,neg,entropy);
        HashMap<String,Integer> m = new HashMap<>();
        for(int i=0;i < dataSet.length;i++ ){
            //needs to be looped for each [][j] column
            String key = dataSet[i][0];
            if(m.containsKey(key)){
                int count = m.get(key);
                count++;
                m.replace(key,count);
            }else{
                m.put(key,1);
            }
        }
        Set<String>keySet = m.keySet();

        /*

        for(String key:keySet){
            int value = m.get(key);
            System.out.printf("Key: %s\nValue: %d\n",key,value);
        }

                 */

        System.out.printf("Key = 0, Value = %d\n",m.get("0"));

        //System.out.printf("Attack Percentage: %f\nNon-Attack Percentage: %f",pos,neg);
        // double entropy = (-(pos)*(Math.log(pos))) -((neg)*(Math.log(neg)));
        //DecimalFormat numberFormat = new DecimalFormat("#.00");
        //System.out.println(entropy);

        //if(newInt == 0){
           // countY = co/
           // countN = countN + 1;
        double colOneAttack = 2024;
        double colOneNonAttack = 23168;
        double posCol1 = colOneAttack/rows;
        double negCol1 = colOneNonAttack/rows;




        //note to self - IG
        //Information gain = ALL the value in a column
        double entropyColOne = 0 - posCol1*Math.log(posCol1)/Math.log(2) - negCol1*Math.log(negCol1)/Math.log(2);
        //System.out.printf("Pos2: %f\nNeg2: %f\nEntropy(This is for the 2nd last row - ratio of attacks to non-attack): %f\nEntropy2: %f\n",posCol1,negCol1,entropy,entropyColOne);
        double informationGain = entropy - (negCol1 * entropyColOne);
        //System.out.println("Information Gain: " + informationGain);






        }








    }

