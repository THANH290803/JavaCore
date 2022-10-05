package Buoi_3;

import java.util.Scanner;

public class Vong_lap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Nhap so nguyen: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            sum = sum + i;
        }
        System.out.println("Tong cua ca so nguyen la: " + sum);

        for (int i = 0; i < n; i++){
            if(i%2==0){
             sum+=i;
            }
        }
        System.out.println("Tong cua ca so nguyen la: " + sum);

        int i = 1;
        while ( i < n) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        do {
            System.out.println(sum);
            sum +=i;
            i++;
        } while (i < n);
    }
}
