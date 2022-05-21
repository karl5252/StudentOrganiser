import Enums.Department;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseReportTest {

    @Test
    void courseReportTextMethodReturnsProperStyledReport(){

        CourseReport courseReport = new CourseReport();
        courseReport.add(CourseSession.create(String.valueOf(Department.CZEC), "200", DateUtility.createDate(2019,5,12)));
        courseReport.add(CourseSession.create(String.valueOf(Department.ENGL), "101", DateUtility.createDate(2020,9,21)));
        courseReport.add(CourseSession.create(String.valueOf(Department.ITAL), "410", DateUtility.createDate(2020,7,3)));

        assertEquals("CZEC 200" + "\n" +
                "ENGL 101" + "\n" +
                "ITAL 410"+ "\n", courseReport.text());

    }
    @Test
    void shouldCourseReportImplementComparableToSortProperly(){

        CourseSession sessionA = CourseSession.create(String.valueOf(Department.CMSC), "101", new Date());
        CourseSession sessionB = CourseSession.create(String.valueOf(Department.ENGL), "101", new Date());
        assertTrue(sessionA.compareTo(sessionB) < 0);
        assertTrue(sessionB.compareTo(sessionA) > 0);

    }
    @Test
    void shouldCourseReportBeSortedByDepartmentAndSession(){

        CourseReport report = new CourseReport();
        report.add(CourseSession.create(String.valueOf(Department.ENGL), "101", new Date()));
        report.add(CourseSession.create(String.valueOf(Department.CZEC), "200", new Date()));
        report.add(CourseSession.create(String.valueOf(Department.ITAL), "410", new Date()));
        report.add(CourseSession.create(String.valueOf(Department.CZEC), "220", new Date()));
        report.add(CourseSession.create(String.valueOf(Department.ITAL), "330", new Date()));

        assertEquals("CZEC 200"+ "\n" +
                "CZEC 220" + "\n" +
                "ENGL 101"+ "\n" +
                "ITAL 330" + "\n" +
                "ITAL 410"+ "\n",
                report.text());

    }

}
