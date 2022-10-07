package Buoi_4.Bai_kiem_tra_co_ban_java;

import java.util.Scanner;

public class Bai_ktra_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Đếm số từ trong chuỗi
        System.out.println("Nhap vao mot chuoi: ");
        String chuoi = input.nextLine();
        int i = 0;
        for (int j = 0; j < chuoi.length(); j++){
            if (j == chuoi.length()-1){
                i += 0;
            }else{
                if (chuoi.charAt(j) == ' '){
                    if ((chuoi.charAt(j+1) == '\n') || (chuoi.charAt(j+1) == ' ')){
                        i += 0;
                    }else{
                        i++;
                    }
                }
            }
        }
        if (chuoi.charAt(0) == ' '){
            System.out.println(i);
        }else{
            System.out.println(i+1);
        }

        // Đếm và in ra index của các ký tự o

        System.out.print("Ky tu can dem so lan xuat hien: ");
        char kyTu=(char) input.nextLine().charAt(0);
        int count=0;
        for(i = 0;i<chuoi.length();i++)
            if(kyTu==chuoi.charAt(i)) count++;
        System.out.println("So lan xuat hien "+kyTu+": "+count);
    }
}
