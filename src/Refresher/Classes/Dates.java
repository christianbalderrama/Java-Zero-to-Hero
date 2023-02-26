package Refresher.Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LOCAL DATE: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("LOCAL TIME: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LOCAL DATE TIME: " + localDateTime);

        DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("FORMATTED: " + localDateTime.format(myFormatObject));
    }
}
