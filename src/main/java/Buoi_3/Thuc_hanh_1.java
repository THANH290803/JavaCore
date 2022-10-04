package Buoi_3;

import java.util.Scanner;

public class Thuc_hanh_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;

        System.out.println("Nhap so a: ");
        a = input.nextDouble();
        System.out.println("Nhap so b: ");
        b = input.nextDouble();

        if (a == 0 && b == 0){
            System.out.println("Vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Vo nghiem");
        } else {
            System.out.println("Ngiem x la: " + (-b/a));
        }
    }
}
