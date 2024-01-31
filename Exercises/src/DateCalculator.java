import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateCalculator {
	public String Method1()
	{
        long currentTimeInMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeInMillis);
        return currentDate.toString();
	}
	public String Method2()
	{
		// Create a SimpleDateFormat with a specific date and time format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	    // Set Timezone 
	    sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
	    // Display the current date and time in the specified format
	    return sdf.format(System.currentTimeMillis());
	}
}
