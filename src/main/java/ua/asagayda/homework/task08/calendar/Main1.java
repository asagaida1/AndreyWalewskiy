package ua.asagayda.homework.task08.calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Map<LocalDateTime, String> mapCalendar = new HashMap();


        DateTimeFormatter dtfMinute = DateTimeFormatter.ofPattern("yyyy.MM.dd ||| HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now1 = LocalDateTime.of(2020,8,01,9,22);
        System.out.println(dtfMinute.format(now1));//2016/11/16 12:08:43
        System.out.println(now1);
        System.out.println("================");
        mapCalendar.put(LocalDateTime.of(2020,8,1,9,22), "Go to work");
        mapCalendar.put(LocalDateTime.of(2020,8,10,9,30), "Go to work");
        mapCalendar.put(LocalDateTime.of(2020,8,20,9,40,35), "Go to work");

        System.out.println(mapCalendar.entrySet());




    }
}
