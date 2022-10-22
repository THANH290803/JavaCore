package BuoI_11.Thuc_hanh_4;

import java.util.Scanner;

public class Student implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Student(){
    }

    public Student(String name, int age, double marks, String classification) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "name: " + name + '\n' + "age: " + age + '\n' + "marks: " + marks + '\n' + "classification: " + classification;
    }

    @Override
    public void classify() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem: ");
        marks = input.nextDouble();
        if (marks >= 8){
            System.out.println("XL: A");
        } else if (marks < 8 || marks > 6.5) {
            System.out.println("XL: B");
        } else {
            System.out.println("XL: C");
        }

        System.out.println("Nhap ten: ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = input.nextInt();
        System.out.println("Nhap xep loai: ");
        input.nextLine();
        classification = input.nextLine();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
