package studentinfo;

import java.util.Objects;

public class Student {
    private static final String IN_STATE = "CO";
    private String name;
    private String surname;
    private int credits;
    private boolean fullTimeStatus = false;
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    private String state;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.state = "";

    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }


    public boolean isFulltime() {
        return this.credits >= CREDITS_REQUIRED_FOR_FULL_TIME;

    }

    public int getCredits() { return credits;    }

    public void addCredits(int credits) {
        if (credits < 0){
            throw  new IllegalArgumentException("Credits cannot be in negative value");
        }else{
            this.credits += credits;
        }

    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isInState() {
        return state.toUpperCase().equals(Student.IN_STATE);
    }
}
