package Buoi_3.BTVN;

import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi ky tu:");
        String str=input.nextLine();
        System.out.print("Ky tu can dem so lan xuat hien: ");
        char e=(char) input.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
            if(e==str.charAt(i)) count++;
        System.out.println("So lan xuat hien "+e+": "+count);
    }
}
