import java.util.Scanner;
import PackagesDemo.information;


public class test {

    public static void main(String[] args){
    double temp1;double temp2;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("First random double please: ");
    temp1 = keyboard.nextDouble();
    System.out.println("First random double please: ");
    temp2 = keyboard.nextDouble();
    information Gathering1 = new information(temp1,temp2);
    System.out.println(Gathering1.add1());
    System.out.println(Gathering1.sub1());
    System.out.println(Gathering1.mult1());
    System.out.println(Gathering1.mys1());
    }

}

