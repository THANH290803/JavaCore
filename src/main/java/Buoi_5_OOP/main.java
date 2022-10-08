package Buoi_5_OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Thuc_hanh_1 th = new Thuc_hanh_1();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id: ");
        th.setId(input.nextInt());
        System.out.println("nhập vào ten: ");
        th.setName(input.nextLine());
        th.setName(input.nextLine());
        System.out.println("Nhap gia: ");
        th.setPrice(input.nextDouble());

        System.out.println("Thue la: " + th.thue());
    }
}
