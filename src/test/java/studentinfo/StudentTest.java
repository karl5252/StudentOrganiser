package studentinfo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import studentinfo.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("All")
public class StudentTest {
    @Test
    void studentObjectShouldReturnAName(){
        final String name = "Janet";
        final String surname = "Doe";
        Student student = new Student(name, surname);
        assertEquals(name, student.getName());

    }



}
