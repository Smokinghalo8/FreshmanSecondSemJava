import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Give the line of letters that will be sorted through");
        String temp1 = keyboard.nextLine();
        System.out.println("Give the letter you want sorted");
        String temp500 = keyboard.nextLine();
        char temp2 = temp500.charAt(0);
        CharacterCountRe demo = new CharacterCountRe();
        System.out.println("There are "+demo.testerAndRunner(temp1,temp2)+" "+temp2+"!");

    }

}
