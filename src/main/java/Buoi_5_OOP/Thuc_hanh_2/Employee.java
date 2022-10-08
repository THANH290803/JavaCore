package Buoi_5_OOP.Thuc_hanh_2;

import java.util.Scanner;

public class Employee extends Person{
    public double experience;
    public String placeWork;



    public void inputEmployee(){
        Scanner input = new Scanner(System.in);
        inputPerson();
        System.out.print("Student's experience: ");
        experience = input.nextDouble();
        System.out.print("Student's placeWork: ");
        input.nextLine();
        placeWork = input.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id: " + id +
                ", name: " + name +
                ", age: " + age +
                ", address: " + address +
                ", experience: " + experience +
                ", placeWork: " + placeWork +
                '}' ;
    }
}


