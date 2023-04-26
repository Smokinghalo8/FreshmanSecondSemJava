


public class student {
    String FirstName;
    String LastName;
    int id;

    //public student(){}

    public student(String FirstName, String LastName, Integer ID){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = ID;
    }

    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public Integer getID(){
        return this.id;
    }
    public String getInfo(){
        return ("First Name: "+this.getFirstName()+"\nLast Name: "+this.getLastName()+"\nID: "+this.getID());
    }

}
