package Buoi_3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Thuc_hanh_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        double x1, x2;

        System.out.println("Nhap so a: ");
        a = input.nextDouble();
        System.out.println("Nhap so b: ");
        b = input.nextDouble();
        System.out.println("Nhap so c: ");
        c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + (-b / a));
            }
        }
        if (a != 0) {
             if (delta < 0) {
                System.out.println("Tinh delta: " + delta);
            } else if (delta == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x1 = " + x1 + ", x2 = " + x2);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
