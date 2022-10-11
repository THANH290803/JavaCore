package Buoi_6_OOP.Thuc_hanh_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Hinh_Chu_Nhat hinh_chu_nhat = new Hinh_Chu_Nhat();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        hinh_chu_nhat.setChieu_rong(input.nextDouble());
        System.out.println("Nhap chieu dai: ");
        hinh_chu_nhat.setChieu_dai(input.nextDouble());
        Hinh_vuong hinh_vuong = new Hinh_vuong();
        System.out.println("Nhap canh: ");
        hinh_vuong.setCanh(input.nextDouble());

        System.out.println("Dien tich HCN: " + hinh_chu_nhat.getDien_tich());
        System.out.println("Chu vi HCN: " + hinh_chu_nhat.getChu_vi());

        System.out.println("Dien tich HV: " + hinh_vuong.getDien_tich());
        System.out.println("Chu vi HV: " + hinh_vuong.getChu_vi());
    }
}
