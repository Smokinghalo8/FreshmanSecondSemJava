package Inheritance;

//name,age,will to live(out of 100)

public class genericPerson {

    String name;
    Integer age;
    Integer willToLive;

    public genericPerson(String name, int age, int willToLive) {
        this.name = name;
        this.age = age;
        this.willToLive = willToLive;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Will To Live{out of 100}: " + willToLive);
    }

    ;
}


    /*
As a sidenote, I know how to work this and the formatting, it's just lame and takes a while, please do not take off :(

@Override
    public String toString(){
return String.format();
}



     */