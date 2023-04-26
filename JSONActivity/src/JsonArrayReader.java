import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonArrayReader {

    private ArrayList<student> studentList = new ArrayList<>();

    public void readJSON(){
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            Type studentListType = new TypeToken<ArrayList<student>>(){}.getType();
            studentList = gson.fromJson(reader, studentListType);

        }catch(IOException e){
            System.err.println("IO Exception :(");
            e.printStackTrace();
        }
    }

    public void display(){
        for(student student:studentList){
            System.out.println(student.getInfo());
        }
    }

}
