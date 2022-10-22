package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Sortbyprice {
    public static void Sortbyprice() {
        ArrayList<Phone> arr = new ArrayList<>();
        arr.sort(Comparator.comparing(Phone::getPrice));
        for (Phone a : arr) {
            System.out.println(a.toString());
        }
    }
}