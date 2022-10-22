package BTVN_Quan_ly_lop_hoc.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SchoolModel {
    public School InformationStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ten hoc sinh: ");
        String name = input.nextLine();
        System.out.println("Ngay thang namw sinh: ");
        String date_of_birth = input.nextLine();
        LocalDate ngaySinh = LocalDate.parse(date_of_birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Quê Quán");
        String homeTown = input.nextLine();
        School school = new School();

        return school;

    }
}
