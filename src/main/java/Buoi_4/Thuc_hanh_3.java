package Buoi_4;

import java.util.Scanner;

public class Thuc_hanh_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c,d;

        System.out.println("Nhap so dong: ");
        d = input.nextInt();

        System.out.println("Nhap so cot: ");
        c = input.nextInt();

        int arr [][];
        int[][] array = new int[d][c];

        int x = 0, sum = 0;
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.println("Nhap gia tri arr["+ i +"]["+ j +"]");
                x = input.nextInt();
                array[i][j] = x;
                System.out.println("arr["+ i +"]["+ j +"]"+ array[i][j]);
            }
        }

        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.println("arr" + array[i][j]+ "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i <= x; i++){
            sum += i;
        }

        System.out.println("Tong la: " + (sum + c+d));
    }
}
