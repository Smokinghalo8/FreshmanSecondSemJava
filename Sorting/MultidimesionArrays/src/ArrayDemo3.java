public class ArrayDemo3 {

    public static void main(String[] args){

    String[][] temp = {{"String1", "String2"},{"String3", "String4"}};
    for(String[] line:temp){
        for(String word:line){
            System.out.println(word);

        }
    }


    }

}
