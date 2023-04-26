import java.util.Scanner;
import java.util.Random;
import java.io.File;

import Pokemons.*;
import Players.*;
import Items.*;

/*
Notes:

Mk0.6
Remodel will not be able to be finished on time, so will the player addition and items; just pokemon since I didn't work on this much outside of class
expect a remake in about a month-ish

Hope ya like!
-Ethan
 */

public class PokemonBattle {

    public static void main(String[] args) {
        String player1name,player2name,temp1,temp2,temp3, Player1Poke="",Player2Poke="";
        String PP1type1="",PP1type2="",PP2type1="",PP2type2="", PP1move1="bash", PP1move2="", move="",PP2move1="bash",PP2move2="";
        String Player2Pokemon="", Player1Pokemon="";
        int PP1hp=0,PP1atk=0,PP1def=0,PP1sAtk=0,PP1sDef=0,PP1spd=0;
        int PP2hp=0,PP2atk=0,PP2def=0,PP2sAtk=0,PP2sDef=0,PP2spd=0;
        int temp4=0, player1WinAmount=0,player2WinAmount=0;
        double damage=0;
        double dmg=0;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player one name: ");
        player1name = keyboard.nextLine();
        System.out.println("Player two name: ");
        player2name = keyboard.nextLine();
        System.out.println(player1name+", Do you want to put stats in manually?");
        temp1 = keyboard.nextLine();
        temp1.toLowerCase();
        if(temp1.equals("yes")){
        System.out.println("Name of Pokemon:");
        Player1Poke = keyboard.nextLine();
        System.out.println("HP value of "+Player1Poke+":");
        PP1hp = Integer.parseInt(keyboard.nextLine());
        System.out.println("Base Attack Damage: ");
        PP1atk = Integer.parseInt(keyboard.nextLine());
        System.out.println("Base Defense: ");
        PP1def = Integer.parseInt(keyboard.nextLine());
        System.out.println("Special Attack Damage: ");
        PP1sAtk = Integer.parseInt(keyboard.nextLine());
        System.out.println("Special Defense: ");
        PP1sDef = Integer.parseInt(keyboard.nextLine());
        System.out.println("Speed: ");
        PP1spd = Integer.parseInt(keyboard.nextLine());


        System.out.println("Whats the Second move?\n-defend");                      //implement more later
        PP1move2 = keyboard.nextLine();

        System.out.println("Whats the type?\n-fire\n-water\n-grass");      //custom creation only gets 1 type(It'll be their main, second will be stuff like [flying])
        PP1type1 = keyboard.nextLine();



        } else if(temp1.equals("no")){
            System.out.println("I have currently implemented a few pokemon, choose which you want: \nbulbasaur\ncharmander\nsquirtle");
            Player1Pokemon = keyboard.nextLine();
            Player1Poke = Player1Pokemon.toLowerCase();                      //Switch to cases when time allows
            if(Player1Poke.equals("bulbasaur")||Player1Poke.equals("b")){
                PP1hp=Bulbasaur.hp;
                PP1atk=Bulbasaur.attack;
                PP1def=Bulbasaur.defense;
                PP1sAtk=Bulbasaur.specialAttack;
                PP1sDef=Bulbasaur.specialDefense;
                PP1spd=Bulbasaur.speed;
                PP1type1=Bulbasaur.type1;
                PP1type2=Bulbasaur.type2;
                PP1move2=Bulbasaur.move2;
            }  else if(Player1Poke.equals("venusaur")){
                PP1hp= Venusaur.hp;
                PP1atk=Venusaur.attack;
                PP1def=Venusaur.defense;
                PP1sAtk=Venusaur.specialAttack;
                PP1sDef=Venusaur.specialDefense;
                PP1spd=Venusaur.speed;
                PP1type1=Venusaur.type1;
                PP1type2=Venusaur.type2;
                PP1move2=Venusaur.move2;
            } else if(Player1Poke.equals("ivysaur")){
                PP1hp=Ivysaur.hp;
                PP1atk=Ivysaur.attack;
                PP1def=Ivysaur.defense;
                PP1sAtk=Ivysaur.specialAttack;
                PP1sDef=Ivysaur.specialDefense;
                PP1spd=Ivysaur.speed;
                PP1type1=Ivysaur.type1;
                PP1type2=Ivysaur.type2;
                PP1move2=Ivysaur.move2;
            } else if(Player1Poke.equals("charmander")){
                PP1hp= Charmander.hp;
                PP1atk=Charmander.attack;
                PP1def=Charmander.defense;
                PP1sAtk=Charmander.specialAttack;
                PP1sDef=Charmander.specialDefense;
                PP1spd=Charmander.speed;
                PP1type1=Charmander.type1;
                PP1move2=Charmander.move2;
            } else if(Player1Poke.equals("charmeleon")){
                PP1hp= Charmeleon.hp;
                PP1atk=Charmeleon.attack;
                PP1def=Charmeleon.defense;
                PP1sAtk=Charmeleon.specialAttack;
                PP1sDef=Charmeleon.specialDefense;
                PP1spd=Charmeleon.speed;
                PP1type1=Charmeleon.type1;
                PP1move2=Charmeleon.move2;
            } else if(Player1Poke.equals("charizard")){
                PP1hp=Charizard.hp;
                PP1atk=Charizard.attack;
                PP1def=Charizard.defense;
                PP1sAtk=Charizard.specialAttack;
                PP1sDef=Charizard.specialDefense;
                PP1spd=Charizard.speed;
                PP1type1=Charizard.type1;
                PP1type2=Charizard.type2;
                PP1move2=Charizard.move2;
            } else if(Player1Poke.equals("squirtle")){
                PP1hp=Squirtle.hp;
                PP1atk=Squirtle.attack;
                PP1def=Squirtle.defense;
                PP1sAtk=Squirtle.specialAttack;
                PP1sDef=Squirtle.specialDefense;
                PP1spd=Squirtle.speed;
                PP1type1=Squirtle.type1;
                PP1move2=Squirtle.move2;
            }                                                    //The rest of the pokemons - megas excluded
        } else {
            System.out.println("Error 1 - skipped if you want to put stats in yourself");}




        //Delete Player 2 if adding more pokemon




        System.out.println(player2name+", Do you want to put stats in manually?");
        temp1 = keyboard.nextLine();
        temp1.toLowerCase();
        if(temp1.equals("yes")){
            System.out.println("Name of Pokemon:");
            Player2Poke = keyboard.nextLine();
            System.out.println("HP value of "+Player2Poke+":");
            PP2hp = Integer.parseInt(keyboard.nextLine());
            System.out.println("Base Attack Damage: ");
            PP2atk = Integer.parseInt(keyboard.nextLine());
            System.out.println("Base Defense: ");
            PP2def = Integer.parseInt(keyboard.nextLine());
            System.out.println("Special Attack Damage: ");
            PP2sAtk = Integer.parseInt(keyboard.nextLine());
            System.out.println("Special Defense: ");
            PP2sDef = Integer.parseInt(keyboard.nextLine());
            System.out.println("Speed: ");
            PP2spd = Integer.parseInt(keyboard.nextLine());
            System.out.println("Whats the Second move?\n-defend");
            PP2move2= keyboard.nextLine();
            System.out.println("Whats the type?\n-fire\n-water\n-grass");      //custom creation only gets 1 type            //FIX THIS SKIPPING ISSUE HOLY FUCK
            PP2type1 = keyboard.nextLine();
        } else if(temp1.equals("no")){
            System.out.println("I have currently implemented a few pokemon, choose which you want: \nbulbasaur\ncharmander\nsquirtle");
            Player2Pokemon = keyboard.nextLine();
            Player2Poke = Player2Pokemon.toLowerCase();
            if(Player2Poke.equals("bulbasaur")){
                PP2hp=Bulbasaur.hp;
                PP2atk=Bulbasaur.attack;
                PP2def=Bulbasaur.defense;
                PP2sAtk=Bulbasaur.specialAttack;
                PP2sDef=Bulbasaur.specialDefense;
                PP2spd=Bulbasaur.speed;
                PP2type1=Bulbasaur.type1;
                PP2type2=Bulbasaur.type2;
                PP2move2=Bulbasaur.move2;
            }  else if(Player2Poke.equals("venusaur")){
                PP2hp= Venusaur.hp;
                PP2atk=Venusaur.attack;
                PP2def=Venusaur.defense;
                PP2sAtk=Venusaur.specialAttack;
                PP2sDef=Venusaur.specialDefense;
                PP2spd=Venusaur.speed;
                PP2type1=Venusaur.type1;
                PP2type2=Venusaur.type2;
                PP2move2=Venusaur.move2;
            } else if(Player2Poke.equals("ivysaur")){
                PP2hp=Ivysaur.hp;
                PP2atk=Ivysaur.attack;
                PP2def=Ivysaur.defense;
                PP2sAtk=Ivysaur.specialAttack;
                PP2sDef=Ivysaur.specialDefense;
                PP2spd=Ivysaur.speed;
                PP2type1=Ivysaur.type1;
                PP2type2=Ivysaur.type2;
                PP2move2=Ivysaur.move2;
            } else if(Player2Poke.equals("charmander")){
                PP2hp= Charmander.hp;
                PP2atk=Charmander.attack;
                PP2def=Charmander.defense;
                PP2sAtk=Charmander.specialAttack;
                PP2sDef=Charmander.specialDefense;
                PP2spd=Charmander.speed;
                PP2type1=Charmander.type1;
                PP2move2=Charmander.move2;
            } else if(Player2Poke.equals("charmeleon")){
                PP2hp= Charmeleon.hp;
                PP2atk=Charmeleon.attack;
                PP2def=Charmeleon.defense;
                PP2sAtk=Charmeleon.specialAttack;
                PP2sDef=Charmeleon.specialDefense;
                PP2spd=Charmeleon.speed;
                PP2type1=Charmeleon.type1;
                PP2move2=Charmeleon.move2;
            } else if(Player2Poke.equals("charizard")){
                PP2hp=Charizard.hp;
                PP2atk=Charizard.attack;
                PP2def=Charizard.defense;
                PP2sAtk=Charizard.specialAttack;
                PP2sDef=Charizard.specialDefense;
                PP2spd=Charizard.speed;
                PP2type1=Charizard.type1;
                PP2type2=Charizard.type2;
                PP2move2=Charizard.move2;
            } else if(Player2Poke.equals("squirtle")||Player2Poke.equals("s")){
                PP2hp=Squirtle.hp;
                PP2atk=Squirtle.attack;
                PP2def=Squirtle.defense;
                PP2sAtk=Squirtle.specialAttack;
                PP2sDef=Squirtle.specialDefense;
                PP2spd=Squirtle.speed;
                PP2type1=Squirtle.type1;
                PP2move2=Squirtle.move2;
            }                                                    //The rest of the pokemons - megas excluded
        } else {
            System.out.println("Error 1 - skipped if you want to put stats in yourself");}

        //end of player 2 choosing

        System.out.println("Starting battle...");       //0=player1,1=player2



    if(whoStart(PP1spd,PP2spd,temp4)==0){
        System.out.println(Player1Poke+", Starts!");
        while(PP1hp>0 && PP2hp>0){                 //int player1ATK,int Player2DEF,int Player2HP, String player1type,String player2type ref for attacking
            System.out.println(Player1Poke+", knows the moves "+PP1move1 +" and "+ PP1move2);  //move2 is ignored need to fix
            System.out.println("What move are you using?");
            move = keyboard.nextLine();
            damage = playerAttackPlayer(PP1atk,PP2def,PP2hp,PP1type1,PP2type1, move,PP1sAtk,PP2sDef);
            System.err.println("Bashed for "+damage+" Damage!");
            PP2hp-=damage;
            System.out.println(Player2Poke+" HP left: "+PP2hp);
            if(PP1hp>0 && PP2hp>0) {
                System.out.println(Player2Poke + ", knows the moves " + PP2move1 + " and " + PP2move2);
                System.out.println("What move are you using?");
                move = keyboard.nextLine();
                damage = playerAttackPlayer(PP2atk, PP1def, PP1hp, PP2type1, PP1type1, move,PP2sAtk,PP1sDef);
                System.err.println("Bashed for "+damage+" Damage!");
                PP1hp-=damage;
                System.out.println(Player1Poke + " HP left: " + PP1hp);
            }else{
                break;
            }//ADDED IF STATEMENT with a break
        }
        if(PP1hp<=0){
            System.out.println(player2name+", Wins!");
            player2WinAmount+=1;
        } else if(PP2hp<=0){
            System.out.println(player1name+", Wins!");
            player1WinAmount+=1;
        } else {System.out.println("Error 5 - Winning screen error - basic");}


    } else if(whoStart(PP1spd,PP2spd,temp4)==1){
        System.out.println(Player2Poke+", Starts!");


        while(PP2hp>0 && PP1hp>0){                 //int player1ATK,int Player2DEF,int Player2HP, String player1type,String player2type ref for attaking
            System.out.println(Player2Poke+", knows the moves "+PP2move1 +" and "+ PP2move2);
            System.out.println("What move are you using?");
            move = keyboard.nextLine();
            damage=playerAttackPlayer(PP2atk,PP1def,PP1hp,PP2type1,PP1type1,move,PP2sAtk,PP1sDef);
            System.err.println("Bashed for "+damage+" Damage!");
            PP1hp-=damage;
            System.out.println(Player1Poke+" HP left: "+PP1hp);
            if(PP2hp>0 && PP1hp>0) {
                System.out.println(Player1Poke + ", knows the moves " + PP1move1 + " and " + PP1move2);
                System.out.println("What move are you using?");
                move = keyboard.nextLine();
                damage=playerAttackPlayer(PP1atk, PP2def, PP2hp, PP1type1, PP2type1, move,PP1sAtk,PP2sDef);
                System.err.println("Bashed for "+damage+" Damage!");
                PP2hp-=damage;
                System.out.println(Player2Poke + " HP left: " + PP2hp);
            } else{
                break; //ADDED IF STATMENT WITH BREAK
            }
        }
        //System.err.println("debug 9 - skipped combat auto win"+PP1hp+"-"+PP2hp);

        if(PP1hp<=0){
            System.out.println(player2name+", Wins!");
            player2WinAmount+=1;
        } else if(PP2hp<=0){
            System.out.println(player1name+", Wins!");
            player1WinAmount+=1;
        } else {System.out.println("Error 5 - Winning screen error - basic");}





    }else{
        System.out.println("debugMe - else finalize - u know where I am");
    }        //int PP1spd, int PP2spd, String Player1Poke, String Player2Poke, int temp4 who start ref







    }




    static int randomNum(int min, int max){     //function that uses random
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1)  + min;
        return randomNumber;}

    static double randomDouble(double min, double max){     //Mainly is used in the attacking function, adds a random chance to do alot of damage or none
        Random randomDouble = new Random();
        double randomDoubleAct = randomDouble.nextDouble(min,max);
        return randomDoubleAct;}

    static double playerAttackPlayer(int player1ATK,int Player2DEF,int Player2HP, String player1type,String player2type,String move,int specAtk,int specDef){
        move.toLowerCase();
        double dmg=0;
        boolean player1Defend=false; boolean player2Defend;
        if(player1Defend){
            dmg = (((((player1ATK*randomDouble(.2,1)) * typeBonusFunc(player1type, player2type)) * (Player2DEF/100))*.75)-(specDef/50)); //defending is kinda overpowered, huh?
        } else {
        if(move.equals("bash")) {
            dmg = ((((player1ATK*randomDouble(0.5,2)) * typeBonusFunc(player1type, player2type)) * Player2DEF/250)-(specDef/100));
            player1Defend = false;
            dmg = critSys(dmg,specAtk);
            return dmg;
        } else if(move.equals("defend")) {
            Player2HP = Player2HP;
            player1Defend = true;
            return dmg;
        } else{
            System.out.println("Fighting system has broken");
        }
        }

        return Player2HP;
    }

    static double typeBonusFunc(String player1Type1,String player2Type1){       //attacker first then defender
        double typeBonus = 1;
        if(player1Type1.equals("fire")&&player2Type1.equals("water")){
            typeBonus = 0.5;
            System.out.println("Not very effective...");
        } else if(player1Type1.equals("water")&&player2Type1.equals("fire")){
            typeBonus = 2;
            System.err.println("Super Effective!");
        } else if(player1Type1.equals("fire")&&player2Type1.equals("grass")){
            typeBonus = 2;
            System.err.println("Super Effective!");
        } else if(player1Type1.equals("grass")&&player2Type1.equals("fire")){
            typeBonus = 0.5;
            System.out.println("Not very effective...");
        } else if(player1Type1.equals("water")&&player2Type1.equals("grass")){
            typeBonus = 0.5;
            System.out.println("Not very effective...");
        } else if(player1Type1.equals("grass")&&player2Type1.equals("water")){
            typeBonus = 2;
            System.err.println("Super Effective!");
        } else{         //can add more, if more types get added, if choosing to update this as I go
            typeBonus=0; System.out.println("null"+"Player1TypeSaved:"+player1Type1+"Player2GTypeSaved:"+player2Type1);
        }
        return typeBonus;
    }

    static int whoStart(int PP1spd, int PP2spd, int temp4){
        if(PP1spd>PP2spd){
            return 0;
        } else if(PP2spd>PP1spd){
            return 1;
        } else if(PP1spd==PP2spd){
            temp4 = randomNum(0,1);
            Math.round(temp4);
            if(temp4==0){
                return 0;
            } else if(temp4==1){
                return 1;
            } else{System.out.println("Error3, Choosing who goes first by random number broke");}
        } else{System.out.println("Error2, Choosing who goes first by speed broke");}
        return 2;
    }
    
    static int validateNumber(int min, int max, int userInput){        //Validates numbers to make sure they are non-negative and people don't cheat 0=badInput 1=passedValidation
        if(userInput<=min){
            return 0;
        } else if(userInput>=max){
            return 0;
        } else if(userInput>min && userInput<max){
            return 1;
        } else{
            System.out.println("Error 6 - Validation error");
        }

        return 0;
    }


    static double critSys(double dmg,int specialAttack){      //Base crit system, maybe in future add certain chances for certain pokemon? like magicarp has 1/2 crit chance?
        int temp = randomNum(0,25);
        int temp2 = randomNum(0,25);
        double dmgReturn=dmg;
        if(temp==temp2){
            System.err.println("CRITICAL HIT!");
            dmgReturn=dmg*(specialAttack/70);
            return dmgReturn;
        } else{
            return dmgReturn;
        }
    }


public static void credits(String[] args){
        System.out.println("Made by Ethan Buckner");
        System.out.println("Play tested by Logan M. (My roommate)");
        System.out.println("Special thanks to my teacher Professor Diekhoff(?) for helping me understand certain parameter types");

}

}
