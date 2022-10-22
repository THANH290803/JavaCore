package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPhone {
    public static void AddNewPhoneName() {
        ArrayList<Phone> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter phone name: ");
        String name = input.nextLine();

        System.out.println("Enter phone carrier name: ");
        String manufacturer = input.nextLine();

        System.out.println("Enter phone IMEI: ");
        int IMEI = input.nextInt();

        System.out.println("Enter phone price: ");
        int price = input.nextInt();

        System.out.println("Enter release date: ");
        input.nextLine();
        String release_date = input.nextLine();
        System.out.println("RAM: ");
        double ram = input.nextDouble();

        System.out.println("ROM: ");
        double rom = input.nextDouble();

        System.out.println("Phone chips: ");
        input.nextLine();
        String chip = input.nextLine();

        System.out.println("Dimensions of the screen: ");
        String screen_size = input.nextLine();

        System.out.println("Size of phone: ");
        String phone_size = input.nextLine();


        Phone ph = new Phone(IMEI, name, manufacturer, price, release_date, ram, rom, chip, screen_size, phone_size);

        arr.add(ph);
    }

}
