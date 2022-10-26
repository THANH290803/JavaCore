package Buoi_12.Lap3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    ArrayList<Worker> arr = new ArrayList<>();

    public static void main(String[] args) {
        information information = new information();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Them nhan vien");
        System.out.println("2. Tang luong");
        System.out.println("3. Giam luong");
        System.out.println("4. Hien thi");

        while (true) {
        int Choose;
        System.out.println("enter the option : ");
        Choose = input.nextInt();

            switch (Choose) {
                case 1:
                    information.setInput();
                    break;
                case 2:
                    information.upSalary();
                    break;
                case 3:
                    information.downSalary();
                case 4:
                    information.display_information();
                    break;
            }
        }
    }
}
