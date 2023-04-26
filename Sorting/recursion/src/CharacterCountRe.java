import java.util.Scanner;

public class CharacterCountRe {
    int temp3;
    public int testerAndRunner(String list, char x){
        int temp1 = list.length();
        for(int i=0; i<temp1; i++){
            if(list.charAt(i)==x){
                temp3++;
            }
        }

        return temp3;
    }

}
