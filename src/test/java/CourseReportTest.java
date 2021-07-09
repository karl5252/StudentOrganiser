import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseReportTest {

    @Test
    void newTestReport(){
        CourseReport courseReport = new CourseReport();
        courseReport.add(CourseSession.create("CZEC", "200", DateUtility.createDate(2019,5,12)));
        courseReport.add(CourseSession.create("ENGL", "101", DateUtility.createDate(2020,9,21)));
        courseReport.add(CourseSession.create("ITAL", "410", DateUtility.createDate(2020,7,3)));

        assertEquals("CZEC 200" + "\n" +
                "ENGL 101" + "\n" +
                "ITAL 410"+ "\n", courseReport.text());


    }
    @Test
    void shouldCourseReportImplementComparableToSortProperly(){
        CourseSession sessionA = CourseSession.create("CMSC", "101", new Date());
        CourseSession sessionB = CourseSession.create("ENGL", "101", new Date());
        assertTrue(sessionA.compareTo(sessionB) < 0);
        assertTrue(sessionB.compareTo(sessionA) > 0);


    }
}
