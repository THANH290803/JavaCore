package Buoi_4;

import java.util.Scanner;

public class Thuc_hanh_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = input.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: " + (i + 1));
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]+= 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
