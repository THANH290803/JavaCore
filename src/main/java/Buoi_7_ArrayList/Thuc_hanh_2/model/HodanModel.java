package Buoi_7_ArrayList.Thuc_hanh_2.model;

import java.util.Scanner;

public class HodanModel {
    public hodan inputHodan(){
        hodan hodan = new hodan();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số nhà: ");
        String numberHouse = input.nextLine();
        System.out.println("Nhap so thanh vien: ");
        String Number_of_member = input.nextLine();
        System.out.println("Nhap id: ");
        int id = input.nextInt();
        hodan.setNumberHouse(numberHouse);
        hodan.setNumber_of_member(Number_of_member);
        hodan.setId(id);
        return hodan;
    }
}
