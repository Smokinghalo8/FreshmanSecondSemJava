

public class Pokemon {

    private String name;
    private int HP;
    private String move;
    private int movePower;
    private int attackSpeed;


    public Pokemon(){

    }

    public void PokemonAdding(String name, int HP, String move, int movePower, int attackSpeed){        //this sets everything not one at a time (That's slow and argentanious)
        this.name=name;
        this.HP=HP;
        this.move=move;
        this.movePower=movePower;
        this.attackSpeed=attackSpeed;
    }

    public String displayPokemonStats(int playerNumber){        //Getting, grabs all the information and puts it all into String format
     return ("Player "+playerNumber+" Pokemon\n----------\nPokemon Name: "+this.name+"\nHP: "+this.HP+"\nMove: "+this.move+"\nMove Power: "+this.movePower+"\nAttack Speed: "+this.attackSpeed+"\n\n");
    }


    //Minor getters below (Not used since the displayPokemonStats already displays all of them in a different manner :P)

    public String getName(){
        return this.name;
    }
    public int getHP(){
        return this.HP;
    }
    public String getMove(){
        return this.move;
    }
    public int getMovePower(){
        return this.movePower;
    }
    public int getAttackSpeed(){
        return this.attackSpeed;
    }
}
