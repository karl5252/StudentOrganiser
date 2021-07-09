package studentinfo;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int credits;
    private boolean fullTimeStatus = false;
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;

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
}
