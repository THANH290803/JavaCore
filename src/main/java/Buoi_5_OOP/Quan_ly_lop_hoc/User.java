package Buoi_5_OOP.Quan_ly_lop_hoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class User {
    public String ID;
    public String name;
    public enum gerder {
        NAM, NU, KHAC
    }
    public String LocalDate_birthday;
    public String email;
    public String phoneNumber;

    public void printInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id: ");
        ID = input.nextLine();
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        LocalDate_birthday = input.nextLine();
        LocalDate lcdt = LocalDate.parse(LocalDate_birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Nhap email: ");
        email = input.nextLine();
        System.out.println("Nhap so dien thoai: ");
        phoneNumber = input.nextLine();
    }

}
