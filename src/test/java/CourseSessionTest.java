import org.junit.jupiter.api.*;
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


    @Test
    void newCourseSessionHasNoStudentsEnrolled(){
        CourseSession courseSession = CourseSession.create(dep, sessionNo,startingDate);

        assertEquals(dep,  courseSession.getDepartment());
        assertEquals(sessionNo, courseSession.getSessionNumber());
        assertEquals(0,courseSession.getNumberOfStudents());
    }
    @Test
    void shouldGetNumberOfStudentsReturnRealNumberOfStudents(){
        CourseSession courseSession = CourseSession.create(dep, sessionNo,startingDate);


        Student student1 = new Student("Josephine", "Test");
        Student student2 = new Student("Daphne","Test" );


        courseSession.enroll(student1);
        courseSession.enroll(student2);

        assertEquals(2,courseSession.getNumberOfStudents());


    }
    @Test
    void shouldReturnStudentsThatEnrolled(){
        CourseSession courseSession = CourseSession.create(dep, sessionNo,startingDate);


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
        //DateUtility dateUtility = new DateUtility();
        startingDate =  DateUtility.createDate(2003,1,6);

        CourseSession courseSession = CourseSession.create("ABCD","203",startingDate);

        Date sixteenWeeksOut = DateUtility.createDate(2003,4,25);
        assertEquals(sixteenWeeksOut,courseSession.getEndDate());
    }
    @RepeatedTest(3)
    void shouldCourseSessionCountReturnHowManySessionsWereCreated(){
        //CourseSession.count = 0;
        CourseSession.resetCount();
        CourseSession.create("ABCD","203",startingDate);
        assertEquals(1,CourseSession.getCount());
        CourseSession.create("ABCDE","204",startingDate);
        assertEquals(2,CourseSession.getCount());

    }
    /*private CourseSession createCourseSession(){
        return new CourseSession("ENGL","101",startingDate);
    }*/






}
