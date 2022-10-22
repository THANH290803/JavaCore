package BTVN_Quan_ly_lop_hoc.Model;

import java.time.LocalDate;

public class School {
    private String Name;
    private LocalDate Date_of_birth;
    private String homeTown;

    public School() {
    }

    public School(String Name, LocalDate Date_of_birth, String homeTown) {
        this.Name = Name;
        this.Date_of_birth = Date_of_birth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "School{" +
                "Name='" + Name + '\'' +
                ", Date_of_birth=" + Date_of_birth +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
