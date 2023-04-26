import java.util.ArrayList;

public class CusomerRecord {

    StringBuilder temp = new StringBuilder();
    ArrayList<String> temp2 = new ArrayList<String>();

    public StringBuilder appendCust(Customer bob){
        temp2.add(bob.getCustomerInfo());
        temp.append(bob.getCustomerInfo());
        return temp;
    }



}
