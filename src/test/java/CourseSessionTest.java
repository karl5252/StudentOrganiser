import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("All")
public class CourseSessionTest {
    @Test
    void newCourseSessionHasNoStudentsEnrolled(){
        final String dep = "MATH";
        final String sessionNo = "101";
        CourseSession courseSession = new CourseSession(dep, sessionNo);

        assertEquals(dep,  courseSession.getDepartment());
        assertEquals(sessionNo, courseSession.getSessionNumber());
        assertEquals(0,courseSession.getNumberOfStudents());
    }
    @Test
    void shouldGetNumberOfStudentsReturnRealNumberOfStudents(){
        final String dep = "MATH";
        final String sessionNo = "101";
        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Daphne","Test" );

        CourseSession courseSession = new CourseSession(dep, sessionNo);
        courseSession.enroll(student1);
        courseSession.enroll(student2);

        assertEquals(2,courseSession.getNumberOfStudents());


    }
    @Test
    void shouldReturnStudentsThatEnrolled(){
        final String dep = "MATH";
        final String sessionNo = "101";
        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Daphne","Tolstoy" );

        CourseSession courseSession = new CourseSession(dep, sessionNo);
        courseSession.enroll(student1);
        courseSession.enroll(student2);

        assertEquals(2, courseSession.getAllStudents().size());
        assertThat(courseSession.getAllStudents().get(0).getName(), is("Josephine"));
        assertThat(courseSession.getAllStudents().get(1).getSurname(), is("Tolstoy"));




    }


}
