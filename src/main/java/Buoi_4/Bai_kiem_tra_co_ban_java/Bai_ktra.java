package Buoi_4.Bai_kiem_tra_co_ban_java;

import java.util.Scanner;

public class Bai_ktra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int doDai;
        System.out.println("Do dai cua hinh *: ");
        doDai = input.nextInt();

        System.out.println("Hinh vuong *");
        for (int i = 0; i < doDai; i++) {           // Su dung vong lap thu 1
            for (int j = 0; j < doDai; j++) {       // Su dung vong lap thu 2
                System.out.print("*" + "\t");       // in ra *
            }
            System.out.println("");
        }


        // Hinh tam giac
        System.out.println("Do dai cua hinh *: ");
        doDai = input.nextInt();

        for (int i = 1; i <= doDai; ++i) {  // Su dung vong lap thu 1
            for (int j = 1; j <= i; ++j) { // Su dung vong lap thu 2
                System.out.print("*"); // in ra *
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
