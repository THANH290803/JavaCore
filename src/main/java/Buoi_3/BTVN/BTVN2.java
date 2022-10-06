package Buoi_3.BTVN;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose = "Yes";
        do {
            int i = 1, n;
            System.out.println("Nhap so: ");
            n = input.nextInt();

            if (n > 9 || n < 0) {
                System.out.println("Nhap lai");
                continue;
            } else if (n == 0) {
                break;
            } else {
                while (i <= 10) {
                    System.out.println(i + "*" + n + "=" + i * n);
                    i++;
                }
            }
            System.out.println("Do you want to continues?(Y/N)");
            input.nextLine();
            choose = input.nextLine();
        } while (choose.equals("Yes")) ;
        input.close();
    }
}

