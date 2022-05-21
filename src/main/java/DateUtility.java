import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtility {
    public static Date createDate(int year, int month, int dayDate) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayDate);

        return calendar.getTime();
    }
}

