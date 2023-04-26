
/*
n BigO class:
• create a method printOnce() that runs in O(1) time
o the method should have a parameter of a number or a String
o the method should just print the parameter value

• create a method printNTimes() that runs in O(n) time
o the method should have a parameter of int n
o the method should print a phrase n number of times

• create a method printNSquaredTimes() that runs in O(n2) time
o the method should have a parameter of int n
o the method should print a phrase n2 number of times

 */


public class bigO {

    String[] allSkyrimGames = {"Arena","Daggerfall","Morrowind", "Oblivion", "Skyrim"};


    public void printOnce(){
        System.out.println("This method will print out a phrase only once");
        System.out.println(allSkyrimGames[0]);
    }

    public void printNTimes(int n){
        System.out.println("This method will print out the same phrase n amount of times");
        for(int i=0; i<=n;i++) {
            System.out.println(allSkyrimGames[0]);
        }
    }


    public void printNSquaredTimes(int n){
        System.out.println("This method will print out the same phrase n^2 amount of times");
        int counter = 0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.println(counter+". "+allSkyrimGames[0]);
            }
            counter++;
        }
    }

}
