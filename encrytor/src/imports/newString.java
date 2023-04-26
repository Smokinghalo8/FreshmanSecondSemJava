package imports;


import java.io.*;
import java.util.*;



public class newString {

    public void details(){
        String Made_by = "Ethan Buckner";
        String For_The_Purpose_of = "Encryptor for starter blah";
        String Attributes = "encryptionCycle";
        String Last_Update = "2/28/2023 9:10 PM";
    }

    String message;
    File file;

    public newString(){

    }
    public void attach(String message, File balls){
        this.message = message;
        this.file = balls;
    }

    public void attach2(File balls){
        this.file = balls;
    }

    public void encryptAndCreate(PrintWriter RipVanWrinkle, File balls)throws IOException {
        StringBuilder lastMessage= new StringBuilder();
        Scanner scan = new Scanner(balls);

        int lengthOfMessage = message.length();
        for (int i = 0 ; i<=(lengthOfMessage-1) ; i++){
            char tempChar = message.charAt(i);
            String tempString = ""+tempChar;
            tempString.toLowerCase();
            switch (tempString){

                case("a"):
                    lastMessage.append("y");
                    break;
                case("b"):
                    lastMessage.append("0");
                    break;
                case("c"):
                    lastMessage.append("z");
                    break;
                case("d"):
                    lastMessage.append("2");
                    break;
                case("e"):
                    lastMessage.append("3");
                    break;
                case("f"):
                    lastMessage.append("1");
                    break;
                case("g"):
                    lastMessage.append("6");
                    break;
                case("h"):
                    lastMessage.append("5");
                    break;
                case("i"):
                    lastMessage.append("4");
                    break;
                case("j"):
                    lastMessage.append("7");
                    break;
                case("k"):
                    lastMessage.append("9");
                    break;
                case("l"):
                    lastMessage.append("8");
                    break;
                case("m"):
                    lastMessage.append(",");
                    break;
                case("n"):
                    lastMessage.append(".");
                    break;
                case("o"):
                    lastMessage.append("a");
                    break;
                case("p"):
                    lastMessage.append("b");
                    break;
                case("q"):
                    lastMessage.append("d");
                    break;
                case("r"):
                    lastMessage.append("c");
                    break;
                case("s"):
                    lastMessage.append("e");
                    break;
                case("t"):
                    lastMessage.append("f");
                    break;
                case("u"):
                    lastMessage.append("g");
                    break;
                case("v"):
                    lastMessage.append("h");
                    break;
                case("w"):
                    lastMessage.append("j");
                    break;
                case("x"):
                    lastMessage.append("i");
                    break;
                case("y"):
                    lastMessage.append("q");
                    break;
                case("z"):
                    lastMessage.append("r");
                    break;//
                case("1"):
                    lastMessage.append("s");
                    break;
                case("2"):
                    lastMessage.append("l");
                    break;
                case("3"):
                    lastMessage.append("t");
                    break;
                case("4"):
                    lastMessage.append("m");
                    break;
                case("5"):
                    lastMessage.append("n");
                    break;
                case("6"):
                    lastMessage.append("o");
                    break;
                case("7"):
                    lastMessage.append("p");
                    break;
                case("8"):
                    lastMessage.append("u");
                    break;
                case("9"):
                    lastMessage.append("+");
                    break;
                case("0"):
                    lastMessage.append("k");
                    break;
                case("."):
                    lastMessage.append("-");
                    break;
                case(","):
                    lastMessage.append("=");
                    break;
                case("+"):
                    lastMessage.append("w");
                    break;
                case("-"):
                    lastMessage.append("x");
                    break;
                case("*"):
                    lastMessage.append("v");
                    break;
                case("="):
                    lastMessage.append("*");
                    break;
                case("\""):
                    lastMessage.append("!");
                    break;
                case("?"):
                    lastMessage.append("(");
                    break;
                case("!"):
                    lastMessage.append(")");
                    break;
                case("("):
                    lastMessage.append("\"");
                    break;
                case(")"):
                    lastMessage.append("?");
                    break;
                case("|"):
                    lastMessage.append("|");
                    break;
                case(" "):
                    lastMessage.append("@");
                    break;
                case("@"):
                    lastMessage.append(" ");
                    break;
                case("A"):
                    lastMessage.append("Y");
                    break;
                case("B"):
                    lastMessage.append("Z");
                    break;
                case("C"):
                    lastMessage.append(":");
                    break;
                case("D"):
                    lastMessage.append(";");
                    break;
                case("E"):
                    lastMessage.append("[");
                    break;
                case("F"):
                    lastMessage.append("'");
                    break;
                case("G"):
                    lastMessage.append("]");
                    break;
                case("H"):
                    lastMessage.append("{");
                    break;
                case("I"):
                    lastMessage.append("_");
                    break;
                case("J"):
                    lastMessage.append("$");
                    break;
                case("K"):
                    lastMessage.append("}");
                    break;
                case("L"):
                    lastMessage.append("#");
                    break;
                case("M"):
                    lastMessage.append("<");
                    break;
                case("N"):
                    lastMessage.append("/");
                    break;
                case("O"):
                    lastMessage.append(">");
                    break;
                case("P"):
                    lastMessage.append("%");
                    break;
                case("Q"):
                    lastMessage.append("&");
                    break;
                case("R"):
                    lastMessage.append("\\");
                    break;
                case("S"):
                    lastMessage.append("X");
                    break;
                case("T"):
                    lastMessage.append("W");
                    break;
                case("U"):
                    lastMessage.append("A");
                    break;
                case("V"):
                    lastMessage.append("B");
                    break;
                case("W"):
                    lastMessage.append("C");
                    break;
                case("X"):
                    lastMessage.append("D");
                    break;
                case("Y"):
                    lastMessage.append("F");
                    break;
                case("Z"):
                    lastMessage.append("E");
                    break;
                case(":"):
                    lastMessage.append("G");
                    break;
                case(";"):
                    lastMessage.append("H");
                    break;
                case("["):
                    lastMessage.append("I");
                    break;
                case("]"):
                    lastMessage.append("J");
                    break;
                case("'"):
                    lastMessage.append("K");
                    break;
                case("_"):
                    lastMessage.append("L");
                    break;
                case("{"):
                    lastMessage.append("M");
                    break;
                case("}"):
                    lastMessage.append("N");
                    break;
                case("$"):
                    lastMessage.append("O");
                    break;
                case("#"):
                    lastMessage.append("P");
                    break;
                case("<"):
                    lastMessage.append("Q");
                    break;
                case(">"):
                    lastMessage.append("R");
                    break;
                case("/"):
                    lastMessage.append("S");
                    break;
                case("%"):
                    lastMessage.append("T");
                    break;
                case("&"):
                    lastMessage.append("U");
                    break;
                case("\\"):
                    lastMessage.append("V");
                    break;



            }//end of switch
        }
        RipVanWrinkle.println(lastMessage);
    //    RipVanWrinkle.close();
    }

    public void justEncrypt(PrintWriter temp)throws IOException {
        StringBuilder lastMessage= new StringBuilder();
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String temp1 = scan.nextLine();
                int characterNumber = temp1.length();
                System.out.println(temp1);

                for (int i = 0; i <= characterNumber - 1; i++) {
                    char tempCharA = temp1.charAt(i);
                    String tempCharB = "" + tempCharA;
                    switch (tempCharB) {

                            case("a"):
                                lastMessage.append("y");
                                break;
                            case("b"):
                                lastMessage.append("0");
                                break;
                            case("c"):
                                lastMessage.append("z");
                                break;
                            case("d"):
                                lastMessage.append("2");
                                break;
                            case("e"):
                                lastMessage.append("3");
                                break;
                            case("f"):
                                lastMessage.append("1");
                                break;
                            case("g"):
                                lastMessage.append("6");
                                break;
                            case("h"):
                                lastMessage.append("5");
                                break;
                            case("i"):
                                lastMessage.append("4");
                                break;
                            case("j"):
                                lastMessage.append("7");
                                break;
                            case("k"):
                                lastMessage.append("9");
                                break;
                            case("l"):
                                lastMessage.append("8");
                                break;
                            case("m"):
                                lastMessage.append(",");
                                break;
                            case("n"):
                                lastMessage.append(".");
                                break;
                            case("o"):
                                lastMessage.append("a");
                                break;
                            case("p"):
                                lastMessage.append("b");
                                break;
                            case("q"):
                                lastMessage.append("d");
                                break;
                            case("r"):
                                lastMessage.append("c");
                                break;
                            case("s"):
                                lastMessage.append("e");
                                break;
                            case("t"):
                                lastMessage.append("f");
                                break;
                            case("u"):
                                lastMessage.append("g");
                                break;
                            case("v"):
                                lastMessage.append("h");
                                break;
                            case("w"):
                                lastMessage.append("j");
                                break;
                            case("x"):
                                lastMessage.append("i");
                                break;
                            case("y"):
                                lastMessage.append("q");
                                break;
                            case("z"):
                                lastMessage.append("r");
                                break;//
                            case("1"):
                                lastMessage.append("s");
                                break;
                            case("2"):
                                lastMessage.append("l");
                                break;
                            case("3"):
                                lastMessage.append("t");
                                break;
                            case("4"):
                                lastMessage.append("m");
                                break;
                            case("5"):
                                lastMessage.append("n");
                                break;
                            case("6"):
                                lastMessage.append("o");
                                break;
                            case("7"):
                                lastMessage.append("p");
                                break;
                            case("8"):
                                lastMessage.append("u");
                                break;
                            case("9"):
                                lastMessage.append("+");
                                break;
                            case("0"):
                                lastMessage.append("k");
                                break;
                            case("."):
                                lastMessage.append("-");
                                break;
                            case(","):
                                lastMessage.append("=");
                                break;
                            case("+"):
                                lastMessage.append("w");
                                break;
                            case("-"):
                                lastMessage.append("x");
                                break;
                            case("*"):
                                lastMessage.append("v");
                                break;
                            case("="):
                                lastMessage.append("*");
                                break;
                            case("\""):
                                lastMessage.append("!");
                                break;
                            case("?"):
                                lastMessage.append("(");
                                break;
                            case("!"):
                                lastMessage.append(")");
                                break;
                            case("("):
                                lastMessage.append("\"");
                                break;
                            case(")"):
                                lastMessage.append("?");
                                break;
                            case("|"):
                                lastMessage.append("|");
                                break;
                            case(" "):
                                lastMessage.append("@");
                                break;
                            case("@"):
                                lastMessage.append(" ");
                                break;
                            case("A"):
                                lastMessage.append("Y");
                                break;
                            case("B"):
                                lastMessage.append("Z");
                                break;
                            case("C"):
                                lastMessage.append(":");
                                break;
                            case("D"):
                                lastMessage.append(";");
                                break;
                            case("E"):
                                lastMessage.append("[");
                                break;
                            case("F"):
                                lastMessage.append("'");
                                break;
                            case("G"):
                                lastMessage.append("]");
                                break;
                            case("H"):
                                lastMessage.append("{");
                                break;
                            case("I"):
                                lastMessage.append("_");
                                break;
                            case("J"):
                                lastMessage.append("$");
                                break;
                            case("K"):
                                lastMessage.append("}");
                                break;
                            case("L"):
                                lastMessage.append("#");
                                break;
                            case("M"):
                                lastMessage.append("<");
                                break;
                            case("N"):
                                lastMessage.append("/");
                                break;
                            case("O"):
                                lastMessage.append(">");
                                break;
                            case("P"):
                                lastMessage.append("%");
                                break;
                            case("Q"):
                                lastMessage.append("&");
                                break;
                            case("R"):
                                lastMessage.append("\\");
                                break;
                            case("S"):
                                lastMessage.append("X");
                                break;
                            case("T"):
                                lastMessage.append("W");
                                break;
                            case("U"):
                                lastMessage.append("A");
                                break;
                            case("V"):
                                lastMessage.append("B");
                                break;
                            case("W"):
                                lastMessage.append("C");
                                break;
                            case("X"):
                                lastMessage.append("D");
                                break;
                            case("Y"):
                                lastMessage.append("F");
                                break;
                            case("Z"):
                                lastMessage.append("E");
                                break;
                            case(":"):
                                lastMessage.append("G");
                                break;
                            case(";"):
                                lastMessage.append("H");
                                break;
                            case("["):
                                lastMessage.append("I");
                                break;
                            case("]"):
                                lastMessage.append("J");
                                break;
                            case("'"):
                                lastMessage.append("K");
                                break;
                            case("_"):
                                lastMessage.append("L");
                                break;
                            case("{"):
                                lastMessage.append("M");
                                break;
                            case("}"):
                                lastMessage.append("N");
                                break;
                            case("$"):
                                lastMessage.append("O");
                                break;
                            case("#"):
                                lastMessage.append("P");
                                break;
                            case("<"):
                                lastMessage.append("Q");
                                break;
                            case(">"):
                                lastMessage.append("R");
                                break;
                            case("/"):
                                lastMessage.append("S");
                                break;
                            case("%"):
                                lastMessage.append("T");
                                break;
                            case("&"):
                                lastMessage.append("U");
                                break;
                            case("\\"):
                                lastMessage.append("V");
                                break;
                    }//end of switch
                }
                temp.print(lastMessage + "\n");
                System.out.println(lastMessage);
                lastMessage = new StringBuilder();
            }//end of while
            temp.close();
            scan.close();


    }



}
