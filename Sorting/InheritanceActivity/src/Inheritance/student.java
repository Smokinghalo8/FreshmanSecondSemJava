package Inheritance;

//name,age,will to live(out of 100),school GPA

public class student extends genericPerson{
    String name;
    Integer age;
    Integer willToLive;
    double schoolGPA;

    public student(String name, int age, int willToLive, double schoolGPA){
        super(name, age, willToLive);
        this.schoolGPA=schoolGPA;
    }

    public void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Will To Live{out of 100}: "+willToLive);
        System.out.println("School GPA: "+schoolGPA);
    };
}


    /*
As a sidenote, I know how to work this and the formatting, it's just lame and takes a while, please do not take off :(

@Override
    public String toString(){
return String.format();
}



     */