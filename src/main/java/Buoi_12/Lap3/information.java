package Buoi_12.Lap3;

import java.util.ArrayList;
import java.util.Scanner;

public class information {
    Scanner input = new Scanner(System.in);
    ArrayList<Worker> arr = new ArrayList<>();

    public  void setInput(){
        System.out.println("Nhập id: ");
        int id = input.nextInt();
        System.out.println("Nhap ten: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhap age: ");
        int age = input.nextInt();
        System.out.println("Nhap luong: ");
        double salary = input.nextDouble();
        System.out.println("Nhap noi lam viec: ");
        input.nextLine();
        String workPlace = input.nextLine();

        Worker worker = new Worker(id, name, age, salary,workPlace);
        arr.add(worker);
    }


    public void upSalary(){
        double luong_thuong;
        double tongLuong;
        System.out.println("tim kiem theo id: ");
        int id = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (id == arr.get(i).getId()) {
                System.out.println("Nhap luong thuong: ");
                luong_thuong = input.nextDouble();

                tongLuong = arr.get(i).getSalary() + luong_thuong;

                System.out.println("Luong nhan duoc la: " + tongLuong);
            }
        }
    }

    public void downSalary(){
        double phat;
        double tongLuong;
        System.out.println("tim kiem theo id: ");
        int id = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (id == arr.get(i).getId()) {
                System.out.println("Nhap luong phat: ");
                phat = input.nextDouble();

                tongLuong = arr.get(i).getSalary() - phat;

                System.out.println("Luong nhan duoc la: " + tongLuong);
            }
        }
    }

    public void display_information(){
        for (Worker a : arr) {
            System.out.println(a.toString());
        }
    }
}
