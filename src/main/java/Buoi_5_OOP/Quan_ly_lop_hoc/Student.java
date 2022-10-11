package Buoi_5_OOP.Quan_ly_lop_hoc;

import java.util.Scanner;

public class Student extends User {
    String isOnline;
    String background;

    @Override
    public void printInfo() {
        Scanner input = new Scanner(System.in);
        super.printInfo();
        System.out.println("Nhap loai hoc: ");
        isOnline = input.nextLine();
        System.out.println("Nhap hinh thuc: ");
        background = input.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", LocalDate_birthday='" + LocalDate_birthday + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "isOnline='" + isOnline + '\'' +
                ", background='" + background + '\'' +
                '}';
    }
}
