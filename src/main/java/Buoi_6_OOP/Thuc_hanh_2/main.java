package Buoi_6_OOP.Thuc_hanh_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinhVienIT it = new SinhVienIT();
        System.out.println("Nhap ho ten: ");
        it.setHo_ten(input.nextLine());
        System.out.println("Nhap Nganh hoc: ");
        it.setNganh(input.nextLine());
        System.out.println("Nhap diem java: ");
        it.setDiemJava(input.nextDouble());
        System.out.println("Nhap diem html: ");
        it.setDiemHtml(input.nextDouble());
        System.out.println("Nhap diem css: ");
        it.setDiemCss(input.nextDouble());

        it.show();

        SinhVienBiz biz = new SinhVienBiz();
        System.out.println("Nhap ho ten: ");
        biz.setHo_ten(input.nextLine());
        biz.setHo_ten(input.nextLine());
        System.out.println("Nhap Nganh hoc: ");
        biz.setNganh(input.nextLine());
        System.out.println("Nhap diem Marketing: ");
        biz.setDiemMarketing(input.nextDouble());
        System.out.println("Nhap diem Sales: ");
        biz.setDiemSales(input.nextDouble());

        biz.show();


    }
}
