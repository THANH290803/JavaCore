package Buoi_5_OOP.Quan_ly_lop_hoc;

import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giao vien");
        System.out.println("Nhap so giao vien: ");
        int gv = input.nextInt();

        Teacher teacher = new Teacher();
        for (int i = 1; i <= gv; i++){
            System.out.println("Giao vien: ");
            teacher.printInfo();
        }
        System.out.println(teacher.toString());
    }
}
