import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSessionTest {
    @Test
    void courseSessionCanBeInstantiated(){
        final String dep = "MATH";
        final String sessionNo = "101";
        CourseSession cSession = new CourseSession(dep, sessionNo);
        assertEquals(dep,  cSession.getDepartment());
        assertEquals(sessionNo, cSession.getSessionNumber());
    }
}
