package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Scanner;

public class filterphonesbyreleasedate {
    public static void filterphonesbyreleasedate(){
        ArrayList<Phone> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date you want to find: ");
        String release_date = input.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (release_date == arr.get(i).getRelease_date()) {
                System.out.println(arr.get(i).toString());
            }
        }
    }
}
