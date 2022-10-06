package Buoi_3.BTVN2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai_Tap {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("±--------------------------------------------------+");
        System.out.println("Chọn chức năng: ");

        Scanner input = new  Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1:
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
                break;
            case 2:
                double c;
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
                break;
            case 3:
                int soDien;

                System.out.println("Nhap so dien: ");
                soDien = input.nextInt();

                if (soDien <= 50){
                    System.out.println("Tien dien la: " + (soDien * 1000));
                } else {
                    System.out.println("Tien dien la: " + ((soDien * 1000)+((soDien-50) * 1200)));
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("Nhap sai");
        }
    }
}
