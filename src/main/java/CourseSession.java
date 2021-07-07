import studentinfo.Student;

import java.util.*;

public class CourseSession {
    private String department;
    private String sessionNumber;
    private Date startingDate;
    private List<Student> enrolledStudents = new ArrayList<>();



    /*public CourseSession(String department, String sessionNumber){
        this.department = department;
        this.sessionNumber = sessionNumber;
    }*/

    public CourseSession(String department, String sessionNumber, Date startingDate) {
        this.department = department;
        this.sessionNumber = sessionNumber;
        this.startingDate = startingDate;
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
    public Date createStartingDate(int year, int month, int dayDate){
        //return new Date(year - 1900, month - 1, dayDate);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH , dayDate);
        return calendar.getTime();
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startingDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR,numberOfDays);

        return calendar.getTime();
    }
}
