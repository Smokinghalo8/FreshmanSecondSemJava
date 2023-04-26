package stringArrayList;

import java.util.ArrayList;

public class imports {

    private ArrayList<String> list = new ArrayList<>();

    public void add(String n){
        list.add(n);
    }

    public void remove(String n){
        if(list.contains(n)) {
            list.remove(n);
        } else {
            System.err.println("Value Does Not Exist");
        }
    }

    public String get(int n){
        //this one uses the index of
        return list.get(n);
    }

    public int size(){
        return list.size();
    }

    public void display(){
        for(String number:list){
            System.out.println(number);
        }
        System.out.println("\n");
    };

}
