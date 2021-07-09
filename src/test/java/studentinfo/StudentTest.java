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
    student.addCredits(99);
    assertEquals(true,student.isFulltime());


    }
    @Test
    void studentShouldNotBeAbleToHaveNegativeCredits(){
        assertThrows(IllegalArgumentException.class, () -> student.addCredits(-5));
    }



}
