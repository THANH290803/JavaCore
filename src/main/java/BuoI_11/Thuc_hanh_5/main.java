package BuoI_11.Thuc_hanh_5;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        inputStudent ipstudent = new inputStudent();


        String check = "yes";
        while (check.equalsIgnoreCase("yes")){
            Student student = ipstudent.inputStudent(input);
            students.add(student);
            System.out.println("do you want to continues y/n ");
            check = input.nextLine();
        }
        System.out.println("list student : " +students);
    }
}
