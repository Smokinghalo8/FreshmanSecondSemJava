package imports;

import java.io.*;
import java.util.*;



public class decryption {
File file;

    public void details(){
        String Made_by = "Ethan Buckner";
        String For_The_Purpose_of = "Decrypt for starter blah";
        String Attributes = "decryptionCycle";
        String Last_Update = "2/28/2023 9:10 PM";
    }


    public decryption(File file){
        this.file = file;
    }

    public void scanFile(PrintWriter temp)throws IOException{
        StringBuilder temp1S= new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
                while (scan.hasNextLine()){
                    String temp1 = scan.nextLine();
                    int characterNumber = temp1.length();
                    System.out.println(temp1);

                    for (int i = 0; i <= characterNumber - 1; i++) {
                        char tempCharA = temp1.charAt(i);
                        String tempCharB = "" + tempCharA;
                        tempCharB.toLowerCase();
                        switch (tempCharB) {

                            case ("a"):
                                temp1S.append("o");
                                break;
                            case ("b"):
                                temp1S.append("p");
                                break;
                            case ("c"):
                                temp1S.append("r");
                                break;
                            case ("d"):
                                temp1S.append("q");
                                break;
                            case ("e"):
                                temp1S.append("s");
                                break;
                            case ("f"):
                                temp1S.append("t");
                                break;
                            case ("g"):
                                temp1S.append("u");
                                break;
                            case ("h"):
                                temp1S.append("v");
                                break;
                            case ("i"):
                                temp1S.append("x");
                                break;
                            case ("j"):
                                temp1S.append("w");
                                break;
                            case ("k"):
                                temp1S.append("0");
                                break;
                            case ("l"):
                                temp1S.append("2");
                                break;
                            case ("m"):
                                temp1S.append("4");
                                break;
                            case ("n"):
                                temp1S.append("5");
                                break;
                            case ("o"):
                                temp1S.append("6");
                                break;
                            case ("p"):
                                temp1S.append("7");
                                break;
                            case ("q"):
                                temp1S.append("y");
                                break;
                            case ("r"):
                                temp1S.append("z");
                                break;
                            case ("s"):
                                temp1S.append("1");
                                break;
                            case ("t"):
                                temp1S.append("3");
                                break;
                            case ("u"):
                                temp1S.append("8");
                                break;
                            case ("v"):
                                temp1S.append("*");
                                break;
                            case ("w"):
                                temp1S.append("+");
                                break;
                            case ("x"):
                                temp1S.append("-");
                                break;
                            case ("y"):
                                temp1S.append("a");
                                break;
                            case ("z"):
                                temp1S.append("c");
                                break;
                            case ("1"):
                                temp1S.append("f");
                                break;
                            case ("2"):
                                temp1S.append("d");
                                break;
                            case ("3"):
                                temp1S.append("e");
                                break;
                            case ("4"):
                                temp1S.append("i");
                                break;
                            case ("5"):
                                temp1S.append("h");
                                break;
                            case ("6"):
                                temp1S.append("g");
                                break;
                            case ("7"):
                                temp1S.append("j");
                                break;
                            case ("8"):
                                temp1S.append("l");
                                break;
                            case ("9"):
                                temp1S.append("k");
                                break;
                            case ("0"):
                                temp1S.append("b");
                                break;
                            case ("."):
                                temp1S.append("n");
                                break;
                            case (","):
                                temp1S.append("m");
                                break;
                            case ("+"):
                                temp1S.append("9");
                                break;
                            case ("-"):
                                temp1S.append(".");
                                break;
                            case ("*"):
                                temp1S.append("=");
                                break;
                            case ("="):
                                temp1S.append(",");
                                break;
                            case ("\""):
                                temp1S.append("(");
                                break;
                            case ("?"):
                                temp1S.append(")");
                                break;
                            case ("!"):
                                temp1S.append("\\");
                                break;
                            case ("("):
                                temp1S.append("?");
                                break;
                            case (")"):
                                temp1S.append("!");
                                break;
                            case ("|"):
                                temp1S.append("|");
                                break;
                            case (" "):
                                temp1S.append("@");
                                break;
                            case("@"):
                                temp1S.append(" ");
                                break;
                            case("A"):
                                temp1S.append("U");
                                break;
                            case("B"):
                                temp1S.append("V");
                                break;
                            case("C"):
                                temp1S.append("W");
                                break;
                            case("D"):
                                temp1S.append("X");
                                break;
                            case("E"):
                                temp1S.append("Z");
                                break;
                            case("F"):
                                temp1S.append("Y");
                                break;
                            case("G"):
                                temp1S.append(":");
                                break;
                            case("H"):
                                temp1S.append(";");
                                break;
                            case("I"):
                                temp1S.append("[");
                                break;
                            case("J"):
                                temp1S.append("]");
                                break;
                            case("K"):
                                temp1S.append("'");
                                break;
                            case("L"):
                                temp1S.append("_");
                                break;
                            case("M"):
                                temp1S.append("{");
                                break;
                            case("N"):
                                temp1S.append("}");
                                break;
                            case("O"):
                                temp1S.append("$");
                                break;
                            case("P"):
                                temp1S.append("#");
                                break;
                            case("Q"):
                                temp1S.append("<");
                                break;
                            case("R"):
                                temp1S.append(">");
                                break;
                            case("S"):
                                temp1S.append("/");
                                break;
                            case("T"):
                                temp1S.append("%");
                                break;
                            case("U"):
                                temp1S.append("&");
                                break;
                            case("V"):
                                temp1S.append("X");
                                break;
                            case("W"):
                                temp1S.append("T");
                                break;
                            case("X"):
                                temp1S.append("S");
                                break;
                            case("Y"):
                                temp1S.append("A");
                                break;
                            case("Z"):
                                temp1S.append("B");
                                break;
                            case(":"):
                                temp1S.append("C");
                                break;
                            case(";"):
                                temp1S.append("R");
                                break;
                            case("["):
                                temp1S.append("E");
                                break;
                            case("]"):
                                temp1S.append("G");
                                break;
                            case("'"):
                                temp1S.append("F");
                                break;
                            case("_"):
                                temp1S.append("I");
                                break;
                            case("{"):
                                temp1S.append("H");
                                break;
                            case("}"):
                                temp1S.append("K");
                                break;
                            case("$"):
                                temp1S.append("J");
                                break;
                            case("#"):
                                temp1S.append("L");
                                break;
                            case("<"):
                                temp1S.append("M");
                                break;
                            case(">"):
                                temp1S.append("O");
                                break;
                            case("/"):
                                temp1S.append("N");
                                break;
                            case("%"):
                                temp1S.append("P");
                                break;
                            case("&"):
                                temp1S.append("Q");
                                break;
                            case("\\"):
                                temp1S.append("R");
                                break;


                        }//end of switch
                    }
                    temp.print(temp1S+"\n");
                    System.out.println(temp1S);
                    temp1S = new StringBuilder();
                }//end of while
                temp.close();
                scan.close();

            } catch(FileNotFoundException e){
                System.err.println("File was not found");
            }


    }

}
