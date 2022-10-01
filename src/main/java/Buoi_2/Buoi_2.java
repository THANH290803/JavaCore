package Buoi_2;

import java.util.Scanner;

public class Buoi_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bai 1
        int a = 10, b = 20;
        int V, S;
        V = (a + b) * 2;
        S = a * b;

        System.out.println("Chu vi hcn la: " + V);
        System.out.println("Dien tich hcn la: " + S);


        // Bai 2
        double PI = 3.14;
        int chuViHinhTron;
        double c;
        double dientichHinhTron = 113.0;
        double d = Math.sqrt(dientichHinhTron / PI) * 2;

        double r = d / 2;

        c = r * r * PI;

        System.out.println("Duong kinh hinh tron la: " + c);


        // Bai 5
        double t = 2.5;
        double v = 4.2;
        double s = 2.5 * 4.2;

        double vBicycle = 5.0/2.0*v;

        System.out.println("Thoi gian di se dap la: " + (s/vBicycle) + "h");
    }

}
