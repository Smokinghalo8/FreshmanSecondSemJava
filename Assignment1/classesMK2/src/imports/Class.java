package imports;

public class Class {
    int number;
    String name;
    String favAnimal;
    int age;
    int favNum;

    public Class(String name, String favAnimal, int age, int favNum){
        this.name = name;
        this.favAnimal = favAnimal;
        this.age = age;
        this.favNum = favNum;

    }

    public void mult(){
        number = age*favNum;
    }

    public void getInformation(){
        System.out.println("Name: "+name+"\nFavorite Animal: "+favAnimal+"\nAge: "+age+"\nFavorite Number: "+favNum+"\nAge times Fav number is: "+number);
    }

}
