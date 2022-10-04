package Buoi_3;

import java.util.Scanner;

public class SwichCase_Cong_Tru_Nhan_Chia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phep;
        double a;
        double b;
        System.out.println("Nhap phep tinh a: ");
        a = input.nextDouble();
        System.out.println("Nhap phep tinh b: ");
        b =input.nextDouble();
        System.out.println("Nhap phep tinh ban muon: ");
        input.nextLine();
        phep = input.nextLine();

        switch (phep) {
            case "+":
                System.out.println("Dap an: " + (a+b));
                break;
            case "-":
                System.out.println("Dap an: " + (a - b));
                break;
            case "*":
                System.out.println("Dap an: " + (a * b));
                break;
            case "/":
                System.out.println("Dap an: " + (a / b));
                break;
            case "%":
                System.out.println("Dap an: " + (a % b));
                break;
            default:
                System.out.println("Nhap sai");
        }
    }
}
