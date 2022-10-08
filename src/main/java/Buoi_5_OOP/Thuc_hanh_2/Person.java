package Buoi_5_OOP.Thuc_hanh_2;

import java.util.Scanner;

public class Person {
    public int id;
    public String name;
    public String address;
    public int age;


    public void inputPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Student's Information");
        System.out.print("Student's ID: ");
        id = input.nextInt();
        System.out.print("Student's name: ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("Student's age: ");
        age = input.nextInt();
        System.out.print("Student's address: ");
        input.nextLine();
        address = input.nextLine();
    }
}
