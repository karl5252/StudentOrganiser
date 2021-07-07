import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import studentinfo.Student;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("All")
public class CourseSessionTest {
    final String dep = "MATH";
    final String sessionNo = "101";
    final Date startingDate = new Date();
    CourseSession courseSession;
    @BeforeEach
    void setup(){
        courseSession = new CourseSession(dep, sessionNo,startingDate);
     }
    @Test
    void newCourseSessionHasNoStudentsEnrolled(){

        assertEquals(dep,  courseSession.getDepartment());
        assertEquals(sessionNo, courseSession.getSessionNumber());
        assertEquals(0,courseSession.getNumberOfStudents());
    }
    @Test
    void shouldGetNumberOfStudentsReturnRealNumberOfStudents(){

        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Daphne","Test" );


        courseSession.enroll(student1);
        courseSession.enroll(student2);

        assertEquals(2,courseSession.getNumberOfStudents());


    }
    @Test
    void shouldReturnStudentsThatEnrolled(){

        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Daphne","Tolstoy" );

        courseSession.enroll(student1);
        courseSession.enroll(student2);

        //assertEquals(2, courseSession.getStudentOfIndex());
        assertThat(courseSession.getStudentOfIndex(0).getName(), is("Josephine"));
        assertThat(courseSession.getStudentOfIndex(1).getSurname(), is("Tolstoy"));

    }
    @Test
    void courseShouldCalculateEndDateGivenStartDate(){

        Date startingDate;
        startingDate =  courseSession.createStartingDate(2003,1,6);

        CourseSession courseSession = new CourseSession("ABCD","203",startingDate);

        Date sixteenWeeksOut = courseSession.createStartingDate(2003,4,25);
        assertEquals(sixteenWeeksOut,courseSession.getEndDate());
    }






}
