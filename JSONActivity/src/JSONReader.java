import com.google.gson.Gson;

import java.io.*;


public class JSONReader {
    public static void main(String[] args){
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            student Student = gson.fromJson(reader, student.class);
            System.out.println("-Student Information-\n\nFirst Name: "+Student.getFirstName()+"\nLast Name: "+Student.getLastName()+"\nID: "+Student.getID());
        }catch(IOException e){
            System.err.println("IO Exception :(");
        }


    }


}
