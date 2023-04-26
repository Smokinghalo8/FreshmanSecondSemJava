public class Main {

    public static void main(String[] args) {

        Customer temp = new Customer("Ethan", "Buckner", "xxx-xxx-xxxx", "xxxx.xmail.com", "N/A", 18);
        Customer temp3 = new Customer("Flanthan", "VIII", "yyy-yyy-yyyy", "yyyy.ymail.com", "N/A", 81);

        StringBuilder tempSpec = new StringBuilder();

        CusomerRecord temp2 = new CusomerRecord();
        tempSpec.append(temp2.appendCust(temp));
        tempSpec.append(temp2.appendCust(temp3));
        System.out.println(tempSpec);




    }

}
