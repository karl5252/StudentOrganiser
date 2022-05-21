import java.util.ArrayList;
import java.util.Collections;

public class CourseReport {
    private ArrayList<CourseSession> sessionList = new ArrayList<>();

    public void add(CourseSession session) {
        sessionList.add(session);
    }

    public String text() {

        Collections.sort(sessionList);
        StringBuilder builder = new StringBuilder();
        for(CourseSession session :  sessionList){
            builder.append(session.getDepartment());
            builder.append(" ");
            builder.append(session.getSessionNumber());
            builder.append("\n");
        }

        return builder.toString();

    }

}
