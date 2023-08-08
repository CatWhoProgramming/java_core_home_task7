package Task2;

import java.util.Calendar;

public class Worker {
    String name;
    String jobTitle;
    int year;

    public Worker(String name, String jobTitle, int year) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.year = year;
    }

    public String toString() {
        return name + " " + jobTitle + " " + year;
    }

}
