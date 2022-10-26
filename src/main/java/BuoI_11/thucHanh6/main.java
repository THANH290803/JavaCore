package BuoI_11.thucHanh6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<>();
        inputStudent1 inputStudent1 = new inputStudent1();
        Scanner input = new Scanner(System.in);

        int choose = 0;
        do {
            System.out.println("1. Them hoc sinh va sinh vien");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Phân loại theo phần trăm");
            System.out.println("0. Exit");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    Student1 student = inputStudent1.inputStudent(input);
                    students.add(student);
                    break;
                case 2:
                    for (Student1 a : students){
                        System.out.println(a + "Phan loai:  "+ inputStudent1.classify(a.getAvgScore()));
                    }
                    break;
                case 3:
                    int loaiA = 0;
                    int loaiB = 0;
                    int loaiC = 0;
                    for (Student1 aStudent: students){
                        if (aStudent.getAvgScore() >= 8){
                            loaiA++;
                        } else if (aStudent.getAvgScore() < 8 && aStudent.getAvgScore() >= 6.5){
                            loaiB ++;
                        } else {
                            loaiC++;
                        }
                    }
                    System.out.println(" Phan tram A = " +(loaiA*100/students.size()) + "%");
                    System.out.println(" Phan tram B = " +(loaiB*100/students.size()) + "%");
                    System.out.println(" Phan tram C = " +(loaiC*100/students.size()) + "%");
                    break;
                case 0 :
                    System.out.println("Exit");
            }
        } while (choose != 0);
    }
}
