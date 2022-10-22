package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Scanner;

public class filterphonesbyprice {
    public static void filterphonesbyprice(){
        ArrayList<Phone> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phone price you want to find: ");
        int Price = input.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (Price == arr.get(i).getPrice()) {
                System.out.println(arr.get(i).toString());
            }
        }
    }
}
