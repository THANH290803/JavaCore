package Buoi_12.Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<employee> arr = new ArrayList<>();
        nhapChucnang nhapChucnang =new nhapChucnang();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Nhập và xuất danh sách nhân viên");
        System.out.println("2. Xóa nhân viên hoặc cập nhật thông tin nhân viên");
        System.out.println("3. Tìm kiếm nhân viên theo lương");
        System.out.println("4. Sắp xếp nhân viên theo họ tên");
        System.out.println("5. Sắp xếp nhân viên theo thu nhập");

        while (true) {
            int Choose;
            System.out.println("enter the option : ");
            Choose = input.nextInt();

            switch (Choose) {
                case 1:
                    nhapChucnang.addEmployee();
                    break;
                case 2:
                    nhapChucnang.removeEmployee();
                    break;
                case 3:
                    nhapChucnang.search();
                    break;
                case 4:
                    nhapChucnang.sortName();
                    break;
                case 5:
                    nhapChucnang.sortSalary();
                    break;
            }
        }
    }
}

