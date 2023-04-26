
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

/*
In the TotalCalories class, write a method that:
• takes as parameters
o the amount of calories per day
o the start date of the diet
o the end date of the diet
• calculates the number of days on the diet
• returns how many total calories were consumed over the days of the diet
Submit the zipped project folder to Canvas by the due date.

 */

public class totalCal {
    private DateFormat dataFormat = new SimpleDateFormat("MM/dd/yyyy");

    public int totalCalories(Integer calories, String startDate, String endDate){
        int days=0;
        try{
            Date date1 = dataFormat.parse(startDate);
            Date date2 = dataFormat.parse(endDate);
            long difference = date2.getTime()-date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }catch (ParseException e){
            System.err.println("Parse Exeption");
        }
        return days*calories;
    }



}
