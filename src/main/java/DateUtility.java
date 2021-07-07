import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtility {
    public Date createDate(int year, int month, int dayDate) {

        //return new Date(year - 1900, month - 1, dayDate);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayDate);
        return calendar.getTime();
    }
}

