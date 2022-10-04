package Buoi_3;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String car;
        System.out.println("Nhap hang xe: ");
        car = input.nextLine();

        switch (car) {
            case "Honda":
                System.out.println("Day la hang xe cua nhat");
                System.out.println("Loai xe: xe may");
                break;
            case "Vison":
                System.out.println("No la xe");
                System.out.println("Gia tien: 20000");
                break;
            case "SH":
                System.out.println("Khong phu hop vs nguoi lun");
                System.out.println("Khong biet gi ve xe");
                break;
            default:
                System.out.println("Nhap loi");
        }
    }
}
