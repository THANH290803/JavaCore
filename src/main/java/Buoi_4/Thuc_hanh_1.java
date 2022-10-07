package Buoi_4;

import java.util.Scanner;

public class Thuc_hanh_1 {
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
            System.out.println(array[i] + "\t");
        }
    }
}
