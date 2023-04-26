


public class BalancedBracketsTester {

    public static void main(String[] args){

        BalancedBrackets balance = new BalancedBrackets();
        System.out.println(balance.checkBalance("{(){}[][]}")); //balanced
        System.out.println(balance.checkBalance("((){}())")); //balanced
        System.out.println(balance.checkBalance("({([)})")); //not balanced

    }

}
