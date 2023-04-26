import java.util.Scanner;//dont wanna use cuz i wanna sleep
import extra.*;

public class overloaded {

    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);    //name,hp,atk
        character myself=new character();
        myself = new character("joe");
        myself = new character("joe", 50,15);
        character person2 = new character("bob",20,30);
        character person3 = new character("sal",100,1);

        System.out.println("\n\n\n");
        System.out.println("Char name is: "+myself.getName());
        System.out.println("My level is: (the next one is the correct one)"+myself.lvlLocator(myself.getHp()));
        System.out.println("My level is: "+myself.lvlLocator(myself.getHp(),myself.getAtk()));
        System.out.println("\n\n\n");
        System.out.println("Char name is: "+person2.getName());
        System.out.println("My level is: (the next one is the correct one)"+person2.lvlLocator(person2.getHp()));
        System.out.println("My level is: "+person2.lvlLocator(person2.getHp(),person2.getAtk()));
        System.out.println("\n\n\n");
        System.out.println("Char name is: "+person3.getName());
        System.out.println("My level is: (the next one is the correct one)"+person3.lvlLocator(person3.getHp()));
        System.out.println("My level is: "+person3.lvlLocator(person3.getHp(),person3.getAtk()));
    }
}
