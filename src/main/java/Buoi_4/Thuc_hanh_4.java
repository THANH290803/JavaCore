package Buoi_4;

import java.util.Scanner;

public class Thuc_hanh_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c,d;
        int sum = 0;

        System.out.println("Nhap so dong: ");
        d = input.nextInt();

        System.out.println("Nhap so cot: ");
        c = input.nextInt();

        int arr [][];
        int[][] array = new int[d][c];

        int x = 0;
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.println("Nhap gia tri arr["+ i +"]["+ j +"]");
                x = input.nextInt();
                array[i][j] = x;
                System.out.println("arr["+ i +"]["+ j +"]"+ array[i][j] +"\t");
            }
        }

        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
                System.out.print( array[i][j]+ "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++){
            if (array[i][j] % 3 == 0){
                sum +=array[i][j];
            }
            }
        }

        System.out.println("Tong la: " + sum);
    }
}
