import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void studentObjectShouldReturnAName(){
        final String name = "Janet Doe";
        Student student = new Student(name);
        assertEquals(name, student.getName());

    }

}
