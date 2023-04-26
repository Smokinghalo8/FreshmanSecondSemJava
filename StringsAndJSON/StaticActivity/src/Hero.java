
/*
Create a class that has
• 3 instance variables

• 1 static (class) variable that
o keeps track of how many instances of the class there are

• a constructor that
o initializes the instance variables
o increments the static variable

• a static method that
o returns the value of the static variable
 */

public class Hero {

    private int hp;
    private int defence;

    private int standing;       //standing as in how they stand with the governments decisions

    private static int heroAmount;


    public Hero(int hp, int defence, int standing){
        this.hp=hp;
        this.defence=defence;
        this.standing=standing;
        heroAmount++;
    }

    public int getHp(){
        return this.hp;
    }

    public int getHeroAmmount(){
        return heroAmount;
    }

}
