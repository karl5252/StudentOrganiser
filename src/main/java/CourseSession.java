public class CourseSession {
    private String department;
    private String sessionNumber;

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
}
