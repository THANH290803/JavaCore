package Buoi_4.Bai_kiem_tra_co_ban_java;

import java.util.Scanner;

public class Bai_ktra_5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int c,d;
            int sum = 0;

            System.out.println("Nhap so dong: ");
            d = input.nextInt();

            System.out.println("Nhap so cot: ");
            c = input.nextInt();

            int arr [][];
            int[][] array1 = new int[d][c];
            int[][] array2 = new int[d][c];
            int[][] array3 = new int[d][c];

            int x = 0;

            // Nhập số của ma trận 1
            System.out.println("Ma tran 1");
            for (int i = 0; i < d; i++){
                for (int j = 0; j < c; j++){
                    System.out.println("Nhap gia tri arr["+ i +"]["+ j +"]");
                    x = input.nextInt();
                    array1[i][j] = x;
                    System.out.println("arr["+ i +"]["+ j +"]"+ array1[i][j] + "\t");
                }
            }

            System.out.println();
            // Nhập số của ma trận 2
            System.out.println("Ma tran 2");
            for (int i = 0; i < d; i++){
                for (int j = 0; j < c; j++){
                    System.out.println("Nhap gia tri arr["+ i +"]["+ j +"]");
                    x = input.nextInt();
                    array2[i][j] = x;
                    System.out.println("arr["+ i +"]["+ j +"]"+ array2[i][j] + "\t");
                }
            }

            // Hien thị kết quả của ma trận 1
            System.out.println("Ket qua cua ma tran 1");
            for (int i = 0; i < d; i++){
                for (int j = 0; j < c; j++){
                    System.out.print( array1[i][j]+ "\t");
                }
                System.out.println("\n");
            }

            // Hien thị kết quả của ma trận 2
            System.out.println("Ket qua cua ma tran 2");
            for (int i = 0; i < d; i++){
                for (int j = 0; j < c; j++){
                    System.out.print( array2[i][j]+ "\t");
                }
                System.out.println("\n");
            }

            // Tính tổng của 2 ma trận
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < c; j++) {
                    array3[i][j] = array1[i][j] + array2[i][j];
                }
            }

            // hiển thị ma trận tổng C
            System.out.println("Ma trận tổng C:");
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(array3[i][j] + "\t");
                }
                System.out.println("\n");
            }
            System.out.println();
        }
}


