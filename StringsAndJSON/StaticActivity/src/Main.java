
/*
2. Create a Main class with
• a main() method that
o creates at least 2 instances of the above class in #1
o uses each of the instances to call the static method and print its return value
o uses the class in #1 to call the static method and print its return value

 */

public class Main {

    public static void main(String[] args){

        Hero GoodHero = new Hero(25,5,157);
        Hero BadHero = new Hero(51,24,5);
        System.out.println("Good Hero Amount: " + GoodHero.getHeroAmmount());
        System.out.println("Bad Hero Amount: " + BadHero.getHeroAmmount());
    }
}
