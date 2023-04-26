import java.util.*;

//is this a selection or just making the pokemon..?
public class PokemonSelection {

    Scanner keyboard = new Scanner(System.in);
    Pokemon tempPokemon1 = new Pokemon();

    public PokemonSelection(){

    }

    public Pokemon createPokemon(Pokemon pokemon){
        System.out.println("Please give a name: ");
        String temp1 = keyboard.nextLine();
        System.out.println("HP Base Value: ");
        int temp2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Move Name: ");
        String temp3 = keyboard.nextLine();
        System.out.println("Move Power Value (base is 10): ");
        int temp4 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Attack Speed: ");
        int temp5 = Integer.parseInt(keyboard.nextLine());
        pokemon.PokemonAdding(temp1,temp2,temp3,temp4,temp5);
        return pokemon;
    }

    public void assignPokemon(int playerNumber, Pokemon pokemon){

        System.out.println("Player "+playerNumber+" please enter the pokemon's name and stats");
        tempPokemon1 = createPokemon(pokemon);
        System.out.println(tempPokemon1.displayPokemonStats(playerNumber));
        if(playerNumber==2){
            keyboard.close();
        }

    }


}
