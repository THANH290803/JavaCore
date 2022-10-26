package BuoI_11.Thuc_hanh_5;

import java.util.Scanner;

public class inputStudent {
    public Student inputStudent(Scanner input){
        Student student = new Student();
        System.out.println("Nhap ten: ");
        String name = input.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = input.nextLine();
        student.setIdStudent();
        student.setName(name);
        student.setAddress(address);
        return student;
    }
}
