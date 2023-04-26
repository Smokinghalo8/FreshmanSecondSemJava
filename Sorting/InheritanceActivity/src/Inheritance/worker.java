package Inheritance;

//name,age,will to live(out of 100),Salary

public class worker extends genericPerson{
    String name;
    Integer age;
    Integer willToLive;
    Integer Salary;

    public worker(String name, int age, int willToLive, int Salary){
        super(name, age, willToLive);
        this.Salary=Salary;
    }
    public void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Will To Live{out of 100}: "+willToLive);
        System.out.println("Salary: "+Salary);
    };
}


    /*
As a sidenote, I know how to work this and the formatting, it's just lame and takes a while, please do not take off :(

@Override
    public String toString(){
return String.format();
}



     */