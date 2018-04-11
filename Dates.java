import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Dates {
    public static void main(String[] args){

        Date today = new Date();
        Calendar testCal = Calendar.getInstance();
        Date now = testCal.getTime();
        Calendar after = now.add(Calendar.DAY_OF_MONTH, 7);

        // System.out.println(now instanceof Date);
        //yes, yes it is.

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("yyyy/MM/dd\n " + dateFormat.format(now));

        dateFormat = new SimpleDateFormat("MMMM dd HH:mm:ss zzzz yyyy");
        System.out.println("month, dd 24hr timezone year\n" + dateFormat.format(now));      
        
        dateFormat = new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss z");
        System.out.println("weekday, dd mmm yyyy 12 hour clock\n" + dateFormat.format(now));
        
        System.out.println(after);
        
        

        
    }
}