package com.msbala;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now =  LocalDateTime.now();
        System.out.println("My local time : ");
        System.out.println(now);

        LocalDateTime nowInAmericaLosAngeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("America Los angeles Time : "+ nowInAmericaLosAngeles);

//        for (String zoneId : ZoneId.getAvailableZoneIds()){
//            System.out.println(zoneId);
//        }

        // create own specific Date

        LocalDate specificDate = LocalDate.of(2023,8,02);
        System.out.println(specificDate);


        // create own specific time

        LocalTime specificTime = LocalTime.of(12,00,00);
        System.out.println(specificTime);
    }
}
