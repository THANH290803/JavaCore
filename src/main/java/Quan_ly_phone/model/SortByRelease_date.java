package Quan_ly_phone.model;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByRelease_date {
    public static void Sortbyrelease() {
        ArrayList<Phone> arr = new ArrayList<>();
        arr.sort(Comparator.comparing(Phone::getRelease_date));
        for (Phone a : arr) {
            System.out.println(a.toString());
        }
    }
}