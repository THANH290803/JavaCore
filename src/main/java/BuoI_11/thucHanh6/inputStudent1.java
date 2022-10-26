package BuoI_11.thucHanh6;

import java.util.Scanner;

public class inputStudent1 {
    public Student1 inputStudent(Scanner input){
        Student1 student = new Student1();
        System.out.println("Nhap id hoc sinh: ");
        int idStudent = input.nextInt();
        System.out.println("Nhap ten hoc sinh: ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.println("Nhap diem toan: ");
        double scoreMath = input.nextDouble();
        System.out.println("Nhập điểm vật lý: ");
        double scorePhysic = input.nextDouble();
        System.out.println("Nhập điểm hóa học: ");
        double scoreChemistry = input.nextDouble();
        double avgScore = (scoreMath+scorePhysic+scoreChemistry)/3;

        student.setIdStudent(idStudent);
        student.setName(Name);
        student.setScoreMath(scoreMath);
        student.setScorePhysic(scorePhysic);
        student.setScoreChemistry(scoreChemistry);
        student.setAvgScore(avgScore);
        return student;
    }

    public String classify(double avgScore){
        if (avgScore >= 8){
            return "A";
        } else if (avgScore < 8 && avgScore >= 6.5){
            return "B";
        } else {
            return "C";
        }
    }
}
