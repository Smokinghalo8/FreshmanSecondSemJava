package AbstractClass;

public abstract class Person {

    private String name;
    private int hoursWorked;
    private int payPerHour;


    public Person(String name, int hoursWorked, int payPerHour){
        this.name=name;
        this.hoursWorked=hoursWorked;
        this.payPerHour=payPerHour;
    }


    public String getName(){
        return this.name;
    }


    public abstract double getSalary();

}
