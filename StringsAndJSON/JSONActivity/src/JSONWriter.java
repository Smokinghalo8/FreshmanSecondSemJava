import com.google.gson.Gson;

import java.io.*;


public class JSONWriter {
    public static void main(String[] args){
        try{
            student Student = new student("Joe","Mama",954213);
            Gson gson = new Gson();
            String JsonString = gson.toJson(Student);
            FileWriter fileWriter = new FileWriter("student1.json");
            fileWriter.write(JsonString);
            fileWriter.close();
        }catch(IOException e){
            System.err.println("IO Exception :(");
            e.printStackTrace();
        }



    }


}
