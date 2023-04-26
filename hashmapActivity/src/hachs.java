
/*
Create a class with:
• a HashMap
• a method to add a key/value pair to the HashMap
• a method to remove a key/value pair from the HashMap
• a method to get the value from the map based on the key
• a method to display both the key and the value
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hachs {

    private Map<String, Integer> alphabetToNumber= new HashMap<>();

    public void addLetterAndNumber(String letter, Integer number){
        alphabetToNumber.put(letter,number);
    }
    public void removeLetter(String letter){
        alphabetToNumber.remove(letter);
    }

    public Object findValue(String letter){
        Object temp;
        if(alphabetToNumber.containsKey(letter)){
            temp = alphabetToNumber.get(letter);
        }else{
            temp = "Course not found";
        }
        return temp;
    }

    public void display(){

        alphabetToNumber.forEach((letter,number) ->
                System.out.println("Letter: "+letter+" Number: "+number)
                );

    }

}
