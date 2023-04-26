package WeekOne;

public class Ethan {
    public static void main(String[] args) {

        String name="Ethan";
        Double GPA=100.999;
        String hairColor="Brown";
        String favColor="Black";    //Im emo now
        double favNumber=3.2;
        int catNumber=2;
        int dogNumber=1;
        int age = 18;
        boolean csMajor= true;

        if(name != "Ethan"){
            System.out.println("Lies!");
        }else{

        System.out.println("My name is, "+name+", GPA is "+GPA+", not to flex or anything, full 100 \nMy hair color is "+hairColor+", Favorite color is "+favColor+", yeah Im emo now. \nMy favorite number is "+favNumber+" and I have "+catNumber+" cats and "+dogNumber+" of dogs.\nI am "+age+" years old as well. \n");
        if(csMajor==true) {
            System.out.print("I am a CS Major");
        }else{
            System.out.print("I am not a CS Major");
            }
        }

    }
}
