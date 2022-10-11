package Buoi_5_OOP.Quan_ly_lop_hoc;

import java.util.Scanner;

public class Teacher extends User {
    int yearOfExperiences;
    String speciality;

    public void printInfo() {
        Scanner input = new Scanner(System.in);
        super.printInfo();
        System.out.println("Nhap nam: ");
        yearOfExperiences = input.nextInt();
        System.out.println("Nhap speciality: ");
        input.nextLine();
        speciality = input.nextLine();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", LocalDate_birthday='" + LocalDate_birthday + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "yearOfExperiences=" + yearOfExperiences +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}



