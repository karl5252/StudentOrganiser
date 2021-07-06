import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void studentObjectShouldReturnAName(){
        String name = "Jannet Doe";
        Student student = new Student(name);
        assertEquals( student.getName(),
                name);


    }

}
