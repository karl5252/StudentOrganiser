import java.util.ArrayList;
import java.util.List;

public class CourseSession {
    private String department;
    private String sessionNumber;
    private int numberOfStudents = 0;
    private List<Student> enrolledStudents = new ArrayList<>();

    public CourseSession(String department, String sessionNumber, int numberOfStudents) {
        this.department = department;
        this.sessionNumber = sessionNumber;
        this.numberOfStudents = numberOfStudents;
    }

    public CourseSession(String department, String sessionNumber){
        this.department = department;
        this.sessionNumber = sessionNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getSessionNumber() {
        return sessionNumber;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
        numberOfStudents = enrolledStudents.size();
    }

    public List<Student> getAllStudents() {
        return enrolledStudents;

    }
}
