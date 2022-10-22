package BTVN_Quan_ly_lop_hoc.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade_blockModel {

    SchoolModel schoolModel = new SchoolModel();

    public Grade_block grade_block(){
        Scanner input = new Scanner(System.in);
        SchoolModel schoolModel = new SchoolModel();
        System.out.println("Nhập tên lớp: ");
        String lop = input.nextLine();
        System.out.println("Nhập số kỳ học: ");
        input.nextInt();
        int semester = input.nextInt();
        System.out.println("Nhập số học sinh");
        input.nextInt();
        int n = input.nextInt();
        ArrayList<School> schools = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ "+( i + 1));
            School school = schoolModel.InformationStudent();
            schools.add(school);
        }

        Grade_block Grade_block = new Grade_block();


        return Grade_block;
    }
}
