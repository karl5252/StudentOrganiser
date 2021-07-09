
import studentinfo.Student;

import java.util.*;

public class CourseSession implements Comparable<CourseSession> {
    private static int count;
    private String department;
    private String sessionNumber;
    private Date startingDate;
    private List<Student> enrolledStudents = new ArrayList<>();

    private int numberOfCredits;


    private CourseSession(String department, String sessionNumber, Date startingDate) {
        this.department = department;
        this.sessionNumber = sessionNumber;
        this.startingDate = startingDate;
        CourseSession.incrementCount();
    }
    //factory
    public static CourseSession create(
            String department,
            String sessionNumber,
            Date startingDate)
    {
        return new CourseSession(department,sessionNumber,startingDate);
    }

    private static void incrementCount() {
        count ++;
    }

    public static void resetCount() {
        count = 0;
    }

    public static int getCount() {
        return count;
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

    List<Student> getAllStudents(){
        return enrolledStudents;
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);

    }

    public Student getStudentOfIndex(int index){
        return enrolledStudents.get(index);
    }



    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startingDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR,numberOfDays);

        return calendar.getTime();
    }


    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int credits) {
        this.numberOfCredits = credits;
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull CourseSession o) {
        return this.getDepartment().compareTo(o.getDepartment());
    }

    /*public boolean compareTo(CourseSession sessionB) {
    }*/
}
