package studentinfo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import studentinfo.Student;

import static org.junit.jupiter.api.Assertions.*;

@Tag("All")
public class StudentTest {
    Student student;
@BeforeEach
void setup(){
     student = new Student("Ross", "Geller");
}
    @Test
    void studentObjectShouldReturnAName(){
        // student = new Student(name, surname);
        assertEquals("Ross", student.getName());

    }

    @Test
    void shouldStudentBeCreatedIsNotFullTime(){
        //Student student = new Student("Ross", "Geller");
        assertFalse(student.isFulltime());
    }
    @Test
    void shouldStudentBeCreatedHasNoCredits(){
       //Student student = new Student("Ross", "Geller");
        assertEquals(0,student.getCredits());
    }
    @Test
    void addingCreditsShouldIncrementCreditsValueOfStudent(){
        //Student student = new Student("Ross", "Geller");
        assertEquals(0,student.getCredits());
        student.addCredits(5);
        assertEquals(5, student.getCredits());
    }
    @Test
    void shouldStudentAccumulate12CreditsWillBeFulltime(){

        assertFalse(student.isFulltime());

    student.addCredits(1);
        assertFalse(student.isFulltime());

    student.addCredits(11);
        assertTrue(student.isFulltime());
    assertEquals(12,student.getCredits());

    student.addCredits(1);
        assertTrue(student.isFulltime());
    assertEquals(13,student.getCredits());



    }
    @Test
    void studentShouldNotBeAbleToHaveNegativeCredits(){
        assertThrows(IllegalArgumentException.class, () -> student.addCredits(-5));
    }
    @Test
    void studentIsInStateIfParamEqualToColorado(){
        student.setState("IO");
        assertFalse(student.isInState());

        student.setState("CO");
        assertTrue(student.isInState());
        student.setState("cO");
        assertTrue(student.isInState());
        student.setState("Co");
        assertTrue(student.isInState());
        student.setState("co");
        assertTrue(student.isInState());
    }
    @Test
    void studentSHouldGracefullyRecoverFromNullValueSuppliedAsState(){
        assertFalse(student.isInState());
    }



}
