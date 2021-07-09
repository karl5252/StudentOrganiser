import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import studentinfo.Student;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("All")
public class RosterReporterTest {

    @Test
    void rosterReporterIsNotNull(){
        //CourseSession courseSession = new CourseSession("test", "12", new Date());
        CourseSession courseSession = CourseSession.create("test", "12", new Date());

        RosterReporter reporter =  new RosterReporter(courseSession);
        assertThat(reporter.getRosterReport(), is(not(0)));
    }
    @Test
    void shouldRosterReporterReturnReportInAString(){

//g
        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Thomas", "Bois");
        Student student3 = new Student("Daphne","Tolstoy" );
        Student student4 = new Student("Matuzalem","Fedorov" );
        //CourseSession courseSession = new CourseSession("test", "12", new Date());
        CourseSession courseSession = CourseSession.create("test", "12", new Date());

        courseSession.enroll(student1);
        courseSession.enroll(student2);
        courseSession.enroll(student3);
        courseSession.enroll(student4);
   //w
        RosterReporter reporter =  new RosterReporter(courseSession);
        String rosterReport = reporter.getRosterReport();
      //t
        System.out.println(rosterReport);
        assertEquals(RosterReporter.ROSTER_REPORT_HEADER + "\nJosephine Test\nThomas Bois\nDaphne Tolstoy\nMatuzalem Fedorov\n" + RosterReporter.ROSTER_REPORT_FOOTER + "4\n", rosterReport);

    }

}
