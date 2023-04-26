package Imports;
import java.util.Random;


/*

Classes to make this easier for setting this up

 */


public class BaseFunctions {

    public int RandomInteger(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }

    public double RandomDouble(double min, double max) {
        Random random = new Random();
        double randomNumber = random.nextDouble((max - min) + 1) + min;
        return randomNumber;
    }

    ;

    public String YesNoResponse() {                  //USES LOWERCASE
        int temp1 = RandomInteger(0, 1);
        if (temp1 == 0) {
            return "yes";
        } else if (temp1 == 1) {
            return "no";
        } else {
            System.err.println("Error1 - yes/no function in BaseFunctions.java");
        }
        return null;
    }

    //--------------------------PEOPLE FUNCTIONS BELOW

    public String[] ElementPickerOverall(int debugNumber1) {
        int temp1 = RandomInteger(0, 100);
        if (debugNumber1 == 0) {//Normal
            if (temp1 <= 75) {

            } else if (temp1 > 75 && temp1 <= 95) {
                ElementPicker(1);
            } else if (temp1 > 95 && temp1 <= 99) {
                ElementPicker(2);
            } else if (temp1 == 100) {
                ElementPicker(3);
            } else {
                System.err.println("Error 2 - ElementPickerOverall in BaseFunctions.java");
            }

        } else if (debugNumber1 == 1) {//debug
            String elements[] = new String[6];
            elements[0] = "fire";
            elements[1] = "electric";
            elements[2] = "earth";
            elements[3] = "water";
            elements[4] = "dark";
            elements[5] = "light";
        }
        return null;
    }

    public String[] ElementPicker(int n) {
        String element = "";
        String element2 = "";
        String elements[] = new String[6];

        for (int i = 0; i == n; i++) {
            int temp1 = RandomInteger(0, 5);


            if (temp1 == 0) {
                element = "fire";
                if (element.equals(element2)) {
                    //problem
                    i -= 1;
                }
                element2 = "fire";
            } else if (temp1 == 1) {
                element = "water";
                if (element.equals(element2)) {
                    //problem
                    i -= 1;
                }
                element2 = "water";
            } else if (temp1 == 2) {
                element = "electric";
                if (element.equals(element2)) {
                    //problem
                    i -= 1;
                }
                element2 = "electric";
            } else if (temp1 == 3) {
                element = "earth";
                if (element.equals(element2)) {
                    //problem
                    i -= 1;
                }
                element2 = "earth";
            } else if (temp1 == 4) {
                element = "light";
                if (element.equals(element2)) {
                    //Problem
                    i -= 1;
                }
                element2 = "light";
            } else if (temp1 == 5) {
                element = "dark";
                if (element.equals(element2)) {
                    //problem
                    i -= 1;
                }
                element2 = "dark";
            } else {
                System.err.println("error 3 - ElementPicker");
            }
            element = elements[i];

        }
        return elements;
    }

    public String randomClassSet(String debug) {     //debug is the name of the class you want
        //list of classes may add more idk[wizard,warrior,thief,merchant,bard,freeloader,clerk]  //minus one for that one rule
        int classNumber = 6;    //THIS NUMBER IS THE AMOUNT OF CLASSES THERE ARE - If you add any other class, pop this number up one kay?
        int temp1 = RandomInteger(0, classNumber);
        if (temp1 == 0 || debug.equals("wizard")) {
            return "wizard";
        } else if (temp1 == 1 || debug.equals("warrior")) {
            return "warrior";
        } else if (temp1 == 2 || debug.equals("thief")) {
            return "thief";
        } else if (temp1 == 3 || debug.equals("merchant")) {
            return "merchant";
        } else if (temp1 == 4 || debug.equals("bard")) {
            return "bard";
        } else if (temp1 == 5 || debug.equals("freeloader")) {
            return "freeloader";
        } else if (temp1 == 6 || debug.equals("clerk")) {
            return "clerk";
        } else {
            System.err.println("error 4 - randomClassSet in BaseFunctions.java");
            return null;
        }
    }

    public String mutation(String debug) {
        //Mutation strand, if gotten at birth. Or use debug as a way of starting off a certain way
        //x is a variable in case the future array full of data wants to be dropped down one or smthn
        int temp1 = RandomInteger(0, 100);
        int x = 0;
        int n = 5; //n in this case is the number of diseases I made up :P
        if (temp1 <= 5) {
            //mutation was formed
            x = 1;
            int temp2 = RandomInteger(0, n);
            if (temp2 == 0) {
                return "asthma";
            } else if (temp2 == 1) {
                return "boneRot";
            } else if (temp2 == 2) {
                return "icedVeins";
            } else if (temp2 == 3) {
                return "bloodyKnuckles";
            } else if (temp2 == 4) {
                return "largeLegs";
            } else if (temp2 == 5) {
                return "quickHealer";
            } else {
                System.err.println("error 5 - Disease at birth error - BaseFunctions");
            }


        } else {
            //no mutation
            return null;
        }
        return null;
    }

    public int randomHp(int debug) {     //0 is the randomNumberBASE - 1 is using classes and elements - 2 is debugHealth value 999999
        if (debug == 0) {
            int temp1 = RandomInteger(0, 25);
            return temp1;
        } else if (debug == 1) {        //Enthic bonus! I need to add that!     AND ENDURANCE DO NOT FORGET
            int baseHP = 20;  //baseHP value for NPCS
            int temp1 = RandomInteger(2, 5);
            double temp2 = RandomDouble(1, 2);
            double temp3 = RandomDouble(1, 2);
            int[] specialSkillsRandomHp = randomBaseStats(0);
            if (specialSkillsRandomHp[0] >= 1 && specialSkillsRandomHp[0] <= 3) {  //remember Strength is 0 and endurance is 2!!!
                Math.round(baseHP += temp1);
            } else if (specialSkillsRandomHp[0] >= 4 && specialSkillsRandomHp[0] <= 7) {
                Math.round(baseHP += (temp1 * temp2));
            } else if (specialSkillsRandomHp[0] >= 8 && specialSkillsRandomHp[0] <= 10) {
                Math.round(baseHP += (temp1 * (temp2 * temp3)));
            } else if (specialSkillsRandomHp[0] >= 11) {
                Math.round(baseHP += (temp1 * (temp2 * temp3) + 5));        //too high?
            } else {
                System.err.println("error");
            }
            //HUGE EQUAtION find code: kj72

        } else if (debug == 2) {
            return 999999999;
        }
        return 0;
    }

    public int[] randomBaseStats(int debug) {  // 0 - Base 0-7 for NPC's | 1-11 danger level {Look at journal}
        //array goes like, Strength,Perception,Endurance,Charisma,Intelligence,Agility,Luck
        int[] specialStats = new int[7];
        switch(debug) {
            case (0):
                specialStats[0] = RandomInteger(0, 7);
                specialStats[1] = RandomInteger(0, 7);
                specialStats[2] = RandomInteger(0, 7);
                specialStats[3] = RandomInteger(0, 7);
                specialStats[4] = RandomInteger(0, 7);
                specialStats[5] = RandomInteger(0, 7);
                specialStats[6] = RandomInteger(0, 7);
                break;
            case (1):
                specialStats[0] = RandomInteger(0, 1);
                specialStats[1] = RandomInteger(0, 1);
                specialStats[2] = RandomInteger(0, 2);
                specialStats[3] = RandomInteger(0, 1);
                specialStats[4] = RandomInteger(0, 2);
                specialStats[5] = RandomInteger(0, 1);
                specialStats[6] = RandomInteger(0, 1);
                break;
            case (2):
                specialStats[0] = RandomInteger(0, 2);
                specialStats[1] = RandomInteger(0, 2);
                specialStats[2] = RandomInteger(0, 2);
                specialStats[3] = RandomInteger(0, 2);
                specialStats[4] = RandomInteger(0, 1);
                specialStats[5] = RandomInteger(0, 2);
                specialStats[6] = RandomInteger(0, 2);
                break;
            case (3):
                specialStats[0] = RandomInteger(0, 3);
                specialStats[1] = RandomInteger(0, 4);
                specialStats[2] = RandomInteger(0, 4);
                specialStats[3] = RandomInteger(0, 4);
                specialStats[4] = RandomInteger(0, 3);
                specialStats[5] = RandomInteger(0, 4);
                specialStats[6] = RandomInteger(0, 3);
                break;
            case (4):
                specialStats[0] = RandomInteger(0, 6);
                specialStats[1] = RandomInteger(0, 4);
                specialStats[2] = RandomInteger(0, 7);
                specialStats[3] = RandomInteger(0, 5);
                specialStats[4] = RandomInteger(0, 6);
                specialStats[5] = RandomInteger(0, 6);
                specialStats[6] = RandomInteger(0, 7);
                break;
            case (5):
                specialStats[0] = RandomInteger(0, 7);
                specialStats[1] = RandomInteger(0, 7);
                specialStats[2] = RandomInteger(0, 8);
                specialStats[3] = RandomInteger(0, 8);
                specialStats[4] = RandomInteger(0, 7);
                specialStats[5] = RandomInteger(0, 8);
                specialStats[6] = RandomInteger(0, 7);
                break;
            case (6):
                specialStats[0] = RandomInteger(0, 8);
                specialStats[1] = RandomInteger(0, 9);
                specialStats[2] = RandomInteger(0, 8);
                specialStats[3] = RandomInteger(0, 8);
                specialStats[4] = RandomInteger(0, 8);
                specialStats[5] = RandomInteger(0, 7);
                specialStats[6] = RandomInteger(0, 8);
                break;
            case (7):
                specialStats[0] = RandomInteger(0, 9);
                specialStats[1] = RandomInteger(0, 10);
                specialStats[2] = RandomInteger(0, 10);
                specialStats[3] = RandomInteger(0, 9);
                specialStats[4] = RandomInteger(0, 9);
                specialStats[5] = RandomInteger(0, 9);
                specialStats[6] = RandomInteger(0, 10);
                break;
            case (8):
                specialStats[0] = RandomInteger(0, 10);
                specialStats[1] = RandomInteger(0, 10);
                specialStats[2] = RandomInteger(0, 10);
                specialStats[3] = RandomInteger(0, 10);
                specialStats[4] = RandomInteger(0, 10);
                specialStats[5] = RandomInteger(0, 10);
                specialStats[6] = RandomInteger(0, 10);
                break;
            case (9):
                specialStats[0] = RandomInteger(0, 12);
                specialStats[1] = RandomInteger(0, 13);
                specialStats[2] = RandomInteger(0, 13);
                specialStats[3] = RandomInteger(0, 14);
                specialStats[4] = RandomInteger(0, 15);
                specialStats[5] = RandomInteger(0, 13);
                specialStats[6] = RandomInteger(0, 15);
                break;
            case (10):
                specialStats[0] = RandomInteger(0, 15);
                specialStats[1] = RandomInteger(0, 15);
                specialStats[2] = RandomInteger(0, 15);
                specialStats[3] = RandomInteger(0, 15);
                specialStats[4] = RandomInteger(0, 15);
                specialStats[5] = RandomInteger(0, 15);
                specialStats[6] = RandomInteger(0, 15);
                break;
            case (11):
                specialStats[0] = RandomInteger(0, 25);
                specialStats[1] = RandomInteger(0, 25);
                specialStats[2] = RandomInteger(0, 25);
                specialStats[3] = RandomInteger(0, 25);
                specialStats[4] = RandomInteger(0, 25);
                specialStats[5] = RandomInteger(0, 25);
                specialStats[6] = RandomInteger(0, 25);
                break;
        }
        return null;
    }

    public int staminaBarAmount(int[] debug){       //look at journal for guide or look at health function PUT IN SPECIAL STATS AS DEBUG
        // takes in endurance and adds stamia max to that level
        int baseStaminaAmount = 100;
        double temp1 = RandomDouble(1,1.5);
        double temp2 = temp1*temp1;
        double temp3 = temp2*2;


        if(debug[2]<=1){
            double temp1a = baseStaminaAmount*temp1;
            int returnThis = (int) temp1a;
            return returnThis;
        }else if(debug[2]<=4&&debug[2]>=2){
            double temp1a = baseStaminaAmount*temp2;
            int returnThis = (int) temp1a;
            return returnThis;
        }else if(debug[2]<=8&&debug[2]>=5){
            double temp1a = baseStaminaAmount*temp3;
            int returnThis = (int) temp1a;
            return returnThis;
        }else if(debug[2]>=9){
            double temp1a = baseStaminaAmount*(temp3+1);
            int returnThis = (int) temp1a;
            return returnThis;
        } else {
            System.err.println("error 5 - staminaBarAmount in BaseFunctions");
            return baseStaminaAmount;
        }
    }

    public String[] specialSkillsCheckAndStarter(int[] debug){       //uses numbers given to give perks        0 being first number in array is a random perk #
        //system works like each number attached to the array will be changed into a String based on what number they are
        int n = 3;      //change n to max number of special skills
        int q;
        int x = debug.length;
        String[] skillSet = new String[x];
        if (debug[0]==0){
            int temp1 = RandomInteger(1,n);
            String temp1S = ""+temp1;
            skillSet[0]=temp1S;
        }
        for(int i=0;i==x;i++){
            int temp1 = debug[i];
            switch(temp1){
                case(1):    //Smooth Talker
                    skillSet[i] = "smoothTalker";
                    break;
                case(2):    //Combat Medic
                    skillSet[i] = "combatMedic";
                    break;
                case(3):    //desensitized
                    skillSet[i] = "desensitized";
                    break;
            }
        }

        return skillSet;
    }

    //Money and Finance
    public double[] moneyConvertor(int sC, int lC, int sS, int lS, int sG, int lG, int P, int moneyConvert){
        double[] temp = new double[7];
        double amountSC=sC*.01;
        double amountLC=lC*.25;
        int amountSS=sS;
        int amountLS=lS*5;
        int amountSG=sG*20;
        int amountLG=lG*50;
        int amountP=P*1000;
        double cashValuereturn=amountSC+amountLC+amountSS+amountLS+amountSG+amountLG+amountP;
        temp[0]=cashValuereturn;
        int sc=0,lc=0,ss=0,ls=0,sg=0,lg=0,p=0;
        if(sC==0&&lC==0&&sS==0&&lS==0&&sG==0&&lG==0&&P==0){
            double cashValue = moneyConvert;
            while(cashValue>=1000){
                p+=1;
                cashValue-=1000;
            }
            while(cashValue>=50){
                lg+=1;
                cashValue-=50;
            }
            while(cashValue>=20){
                sg+=1;
                cashValue-=20;
            }
            while(cashValue>=5){
                ls+=1;
                cashValue-=5;
            }
            while(cashValue>=1){
                ss+=1;
                cashValue-=1;
            }
            while(cashValue>=0.25){
                lc+=1;
                cashValue-=0.25;
            }
            while(cashValue>=.01){
                sc+=1;
                cashValue-=0.01;
            }
            temp[0]=sc;temp[1]=lc;temp[2]=ss;temp[3]=ls;temp[4]=sg;temp[5]=lg;temp[6]=p;
            return temp;
        }
        return temp;
    }


}


