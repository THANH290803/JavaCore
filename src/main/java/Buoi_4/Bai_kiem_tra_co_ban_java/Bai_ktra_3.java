package Buoi_4.Bai_kiem_tra_co_ban_java;

import java.util.Scanner;

public class Bai_ktra_3 {
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n = ");
        int n=input.nextInt();

        if(isPrimeNumber(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }

        input.close();
    }
}
