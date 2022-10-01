package Buoi_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Thuc_hanh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bai 1
        System.out.println("Nhap ten cua ban: ");
        String name = input.nextLine();
        System.out.println("Nhap tuoi cua ban: ");
        int age = input.nextInt();
        System.out.println("Nhap email: ");
        input.nextLine();
        String email = input.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        String address = input.nextLine();

        System.out.println("Thong tin cua ban: ");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Eamil: " + email);
        System.out.println("Dia chi: " + address);

        System.out.println("Ten kho hang cau ban: ");
        String warehouse = input.nextLine();
        System.out.println("Input birrthdate: ");
        String dateDayString = input.nextLine();
        LocalDate lcdt = LocalDate.parse(dateDayString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(lcdt);
    }
}
