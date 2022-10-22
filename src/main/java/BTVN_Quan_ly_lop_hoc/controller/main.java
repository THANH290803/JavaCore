package BTVN_Quan_ly_lop_hoc.controller;

import BTVN_Quan_ly_lop_hoc.Model.Grade_block;
import BTVN_Quan_ly_lop_hoc.Model.Grade_blockModel;
import BTVN_Quan_ly_lop_hoc.Model.School;
import BTVN_Quan_ly_lop_hoc.Model.SchoolModel;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        School school = new School();
        SchoolModel schoolModel = new SchoolModel();
        Grade_blockModel grade_blockModel = new Grade_blockModel();
        Grade_block grade_block = new Grade_block();
        while (true) {
            System.out.println("1. Nhập danh sách học sinh");
            System.out.println("2. Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
            System.out.println("3. Hiển thị ra màn hình tất cả những học sinh của lớp 10A1");
            System.out.println("0. Thoát Chương Trình");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Xin mời nhập phần bạn muốn chọn: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                        grade_block = grade_blockModel.grade_block();
                    break;
                case 2:
                    System.out.println("Khong biet lam");
                    break;
                case 3:
                    if (grade_block.getLop() == "10A1") {
                        for (int i = 0; i < grade_block.getSchools().size(); i++) {
                            if (grade_block.getLop().equalsIgnoreCase(grade_block.getLop())) {
                                System.out.println(grade_block.getSchools().get(i).toString());
                            } else {
                                System.out.println("không có lớp 10A1 nào!");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thoát Chương Trình");
                    System.exit(0);
                    break;
            }
        }
    }
}
