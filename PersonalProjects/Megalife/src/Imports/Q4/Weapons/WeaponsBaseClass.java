package Imports.Q4.Weapons;

import Imports.BaseFunctions;

public class WeaponsBaseClass {

    int atk;
    int durability;
    int specialAttackAmount;
    String specialAttack;
    double baseCost;
    String metalType;

    public WeaponsBaseClass(Integer atk, Integer durability, Integer specialAttackAmount, String specialAttack, double baseCost, String metalType){
        this.atk=atk;
        this.durability=durability;
        this.specialAttackAmount=specialAttackAmount;
        this.specialAttack=specialAttack;
        this.baseCost=baseCost;
        this.metalType=metalType;
    }
}
