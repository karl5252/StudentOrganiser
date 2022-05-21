package studentinfo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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

        assertEquals("Ross", student.getName());

    }

    @Test
    void shouldStudentBeCreatedIsNotFullTime(){

        assertFalse(student.isFullTime());

    }
    @Test
    void shouldStudentBeCreatedHasNoCredits(){

        assertEquals(0,student.getCredits());

    }
    @Test
    void addingCreditsShouldIncrementCreditsValueOfStudent(){

        assertEquals(0,student.getCredits());

        student.addCredits(5);

        assertEquals(5, student.getCredits());

    }
    @Test
    void shouldStudentAccumulate12CreditsWillBeFullTime(){

        assertFalse(student.isFullTime());

    student.addCredits(1);

        assertFalse(student.isFullTime());

    student.addCredits(11);

        assertTrue(student.isFullTime());

    assertEquals(12,student.getCredits());

    student.addCredits(1);

        assertTrue(student.isFullTime());

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
    void studentShouldGracefullyRecoverFromNullValueSuppliedAsState(){

        assertFalse(student.isInState());

    }

}
