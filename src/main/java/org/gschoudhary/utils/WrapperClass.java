package org.gschoudhary.utils;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class WrapperClass {
    public static void main(String[] args) {
        boolean b = true;
        Boolean B = b;
        B = Boolean.getBoolean("true");

        short s = 43;
        int i = 19;
        float f = 102.0f;
        long l = 12;
        double d = 12;
        char c = 192;
        String str = "";
        char[] ac = new char[10];
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
//        default format as yyyy-MM-dd-HH-mm-ss.zzz.
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse(LocalDateTime.now().format(format), format);
        System.out.println("format " + LocalDateTime.now().format(format));
        Timestamp timestamp = Timestamp.from(Instant.now());
        System.out.println(timestamp.toString());
//        timestamp in java
//        blob / clob


        Integer integer = new Integer(12);

    }
}
