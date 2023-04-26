import java.util.Stack;

public class BalancedBrackets {

    public String checkBalance(String string){
        int countLeft1=0;
        int countRight1=0;
        int countLeft2=0;
        int countRight2=0;
        int countLeft3=0;
        int countRight3=0;
        Stack<Character> slack = new Stack<Character>();

        for(int i=0; i<string.length();i++){

            char c = string.charAt(i);
            if(c=='('){
                slack.push(c);
                countLeft1++;
                System.out.println(slack);
            } else if(c==')'){
                countRight1++;
                //slack.pop();
            }
            else if(c=='{'){
                slack.push(c);
                countLeft2++;
            } else if(c=='}'){
                countRight2++;
            } else if(c=='['){
                slack.push(c);
                countLeft3++;
            } else if(c==']'){
                countRight3++;
            }

        }
        /*
        if(slack.empty()){
            return "Balanced";
        } else{
            return "Not Balanced";
        }

         */
        if(countRight1==countLeft1&&countRight2==countLeft2&&countRight3==countLeft3){
            return "Balanced";
        } else {
            return "Not Balanced";
        }



    }

}
