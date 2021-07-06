import studentinfo.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseSession {
    private String department;
    private String sessionNumber;
    private List<Student> enrolledStudents = new ArrayList<>();



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
        return enrolledStudents.size();
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);

    }

    public Student getStudentOfIndex(int index){
        return enrolledStudents.get(index);
    }
}
