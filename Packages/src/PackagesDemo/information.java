package PackagesDemo;

public class information {
    double number1; double number2;
    private int number3; private int number4;

    public information(double number1, double number2){
        this.number1=number1;
        this.number2=number2;
    }

    public double mult1(){
        number3=5;
        number4=7;
        return number1*number2*number3/number4;
    }

    public double add1(){
        number3=2;number4=3;
        return number4+number3+number1-number2;
    }

    public double sub1(){
        number3=6;number4=9;
        return (number3+number1)-(number4+number1);
    }

    public double mys1(){
        number3=0;number4=5;
        return Math.pow((number1*number4-number3),number2);
    }
}
