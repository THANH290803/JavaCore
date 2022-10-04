package Buoi_3;

import java.util.Scanner;

public class Thuc_hanh_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soDien;

        System.out.println("Nhap so dien: ");
        soDien = input.nextInt();

        if (soDien <= 50){
            System.out.println("Tien dien la: " + (soDien * 1000));
        } else {
            System.out.println("Tien dien la: " + ((soDien * 1000)+((soDien-50) * 1200)));
        }
    }
}
