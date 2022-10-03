package Buoi_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BTVN {
    public static void main(String[] args) {
        String dateMouthNow = "2022/10/02 10:47:30";
        LocalDateTime lcdt = LocalDateTime.parse(dateMouthNow, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(lcdt);
        System.out.println(lcdt.plusDays(3));

        // Phan bo sung
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().plusDays(3));
    }
}
