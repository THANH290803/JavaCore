package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletePhone {
    public static void Deletephone(){
        ArrayList<Phone> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter IMEI of the phone you want to delete: ");
        int IMEI = input.nextInt();

        int d = -1;
        boolean tinThay = false;
        for (int i = 0; i < arr.size(); i++) {
            if (IMEI == arr.get(i).getIMEI()) {
                tinThay = true;
                d = i;
                System.out.println("Deleted");
                break;
            }
        }

        if (tinThay = false) System.out.println("Phone not found");
        else {
            arr.remove(d);
        };
    }
}
