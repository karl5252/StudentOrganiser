import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("All")
public class DateUtilityTest {
    @Test
    void shouldDateUtilityNotReturnNull(){
        GregorianCalendar calendar = new GregorianCalendar();
        DateUtility dateUtil = new DateUtility();
        Date test = dateUtil.createDate(2020, 1, 1);


        assertEquals(new Date(120,Calendar.JANUARY,1), test);
    }
}
