package Buoi_7_ArrayList.Thuc_hanh_2.model;

import java.util.Scanner;

public class MemberModel {
    public Member inputMember(){
        Member member = new Member();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tên:");
        String name = input.nextLine();
        System.out.println("nhập nghề nghiệp");
        String job = input.nextLine();
        System.out.println("nhập ngày sinh: ");
        String dob = input.nextLine();
        member.setFullname(name);
        member.setDob(dob);
        member.setJob(job);
        return member;
    }
}
