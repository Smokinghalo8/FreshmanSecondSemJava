import java.util.Scanner;
import imports.Class;

public class ClassTest {

    public static void main(String[] args){
        int temp1Int=0; int temp2Int=0;
        String temp1String="", temp2String="";
        Scanner keyboard = new Scanner(System.in);
//name,favAnimal,age,favNumber
        Class debug1 = new Class("debug","nothing, I'm single",18,77);

        System.out.println("What's your name?");
        temp1String = keyboard.nextLine();
        System.out.println("What's your fav animal?");
        temp2String = keyboard.nextLine();
        System.out.println("How old are you?");
        temp1Int=Integer.parseInt(keyboard.nextLine());
        System.out.println("What's your fav number?");
        temp2Int=Integer.parseInt(keyboard.nextLine());

        Class person = new Class(temp1String,temp2String,temp1Int,temp2Int);
        debug1.mult();
        person.mult();
        System.err.println("Added in a debug class too, just because");
        debug1.getInformation();
        person.getInformation();
    }

}
