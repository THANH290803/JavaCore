package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Scanner;

public class EditPhone {
    public static void Editphone() {
        ArrayList<Phone> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter IMEI of the phone you want to fix: ");
        int IMEI = input.nextInt();
        boolean timThay = false;
        for (int i = 0; i < arr.size(); i++) {
            if (IMEI == arr.get(i).getIMEI()) {

                System.out.println("Enter phone name: ");
                input.nextLine();
                String name = input.nextLine();

                System.out.println("Enter phone carrier name: ");
                String manufacturer = input.nextLine();

                System.out.println("Enter phone price: ");
                int price = input.nextInt();

                System.out.println("Enter release date: ");
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

                arr.get(i).setName(name);
                arr.get(i).setManufacturer(manufacturer);
                arr.get(i).setPrice(price);
                arr.get(i).setRelease_date(release_date);
                arr.get(i).setRAM_capacity(ram);
                arr.get(i).setROM_capacity(rom);
                arr.get(i).setChip(chip);
                arr.get(i).setScreen_size(screen_size);
                arr.get(i).setPhone_size(phone_size);
                timThay = true;
                break;
            }
        }
        if (timThay == false) System.out.println("Phone not found");
        for (Phone a : arr) {
            System.out.println(a.toString());
        }
    }
}