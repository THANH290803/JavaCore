package Buoi_3.BTVN;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose;
        do {
                int i = 1, n;
                System.out.println("Nhap so: ");
                n = input.nextInt();

                while (i <= 10) {
                    System.out.println(i + "*" + n + "=" + i * n);
                    i++;
                }
                System.out.println("Do you want to continues?(Y/N)");
                input.nextLine();
                choose = input.nextLine();

        } while (choose.equalsIgnoreCase("Yes"));
        input.close();
    }
}
