import studentinfo.Student;

public class RosterReporter {
    static final String ROSTER_REPORT_HEADER ="Student" + "\n" + "———-" +  "\n" ;
    static final String ROSTER_REPORT_FOOTER = "\n"  +"# students = ";

    private CourseSession courseSession;

    public RosterReporter(CourseSession courseSession){
        this.courseSession = courseSession;
    }
    public String getRosterReport() {
        StringBuilder builder = new StringBuilder();
        builder.append(ROSTER_REPORT_HEADER );
        builder.append("\n");


        for (Student student: courseSession.getAllStudents()) {
            builder.append(student.getName());
            builder.append(" ");
            builder.append(student.getSurname());
            builder.append("\n");
        }
        builder.append(ROSTER_REPORT_FOOTER);
        builder.append(courseSession.getAllStudents().size());
        builder.append("\n");

        return builder.toString();
    }
}
