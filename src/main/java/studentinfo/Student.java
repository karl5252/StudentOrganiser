package studentinfo;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int credits;
    private boolean fullTimeStatus = false;

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
        if(this.credits >= 12){
            return true;
        }else{
            return false;
        }

    }

    public int getCredits() { return credits;    }

    public void addCredits(int credits) {
         this.credits += credits;
    }
}
