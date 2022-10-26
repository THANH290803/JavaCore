package Buoi_12.Lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class nhapChucnang {

    Scanner input = new Scanner(System.in);
    ArrayList<employee> arr = new ArrayList<>();

    public void addEmployee(){
        System.out.println("Nhập id: ");
        int id = input.nextInt();
        System.out.println("Nhap ten: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhap luong: ");
        double salary = input.nextDouble();

        employee employee = new employee(id, name, salary);
        arr.add(employee);

        System.out.println(employee.toString());
    }

    public void removeEmployee() {
        System.out.println("Enter IMEI of the phone you want to delete: ");
        int id = input.nextInt();

        int d = -1;
        boolean tinThay = false;
        for (int i = 0; i < arr.size(); i++) {
            if (id == arr.get(i).getId()) {
                tinThay = true;
                d = i;
                System.out.println("Deleted");
                break;
            }
        }

        if (tinThay = false) System.out.println("Phone not found");
        else {
            arr.remove(d);
        }
    }

    public void search(){
        System.out.println("nhap luong ban muon tim kiem: ");
        int salary = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (salary == arr.get(i).getLuong()) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void sortName(){
        arr.sort(Comparator.comparing(employee::getName));
        for (employee a : arr) {
            System.out.println(a.toString());
        }
    }

    public void sortSalary(){
        arr.sort(Comparator.comparing(employee::getLuong));
        for (employee a : arr) {
            System.out.println(a.toString());
        }
    }
}
