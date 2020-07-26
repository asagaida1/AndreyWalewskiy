package ua.asagayda.homework.task08.calendar.task1;

//  Выводить текущее время и дату в нескольких тайм-зонах(на выбор). При выводе даты и времени выводить также события на данный день.

import java.time.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Выводить текущее время и дату в нескольких тайм-зонах(на выбор): ");
        // your local date/time with no timezone information
        LocalDateTime localNow = LocalDateTime.now();
        System.out.println("LocalDateTime localNow = LocalDateTime.now() = " + localNow);

        // setting UTC as the timezone
        ZonedDateTime zonedUTC = localNow.atZone(ZoneId.of("UTC"));
        System.out.println("ZonedDateTime zonedUTC = localNow.atZone(ZoneId.of(\"UTC\"))" + zonedUTC);

        // converting to IST
        ZonedDateTime zonedIST = zonedUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("ZonedDateTime zonedIST = zonedUTC.withZoneSameInstant(ZoneId.of(\"Asia/Kolkata\")) = " + zonedIST);

        System.out.println("=================================");
        System.out.println("При выводе даты и времени выводить также события на данный день");

        Calendar calendar = new Calendar(LocalDate.of(2020,8,1), LocalTime.of(10,10),"Go to work");
        System.out.println(calendar.toString());
        calendar.addToList(calendar);
        System.out.println(calendar.list);
        calendar.addToList(new Calendar(LocalDate.of(2020,8,2), LocalTime.of(10,10),"Go to work"));
        calendar.addToList(new Calendar(LocalDate.of(2020,8,3), LocalTime.of(10,10),"Go to work"));
        calendar.addToList(new Calendar(LocalDate.of(2020,8,3), LocalTime.of(18,15),"Go to home"));
        System.out.println(calendar.list);
//        System.out.println(calendar.list.contains(LocalDate.of(2020,8,3)));

        for (Calendar c: calendar.list) {
            if(c.getLocalDate().equals(LocalDate.of(2020,8,3))){
                    //c.list.contains(LocalDate.of(2020,8,1))){
                System.out.println("---");
                System.out.println("Дата содержится");
                System.out.println(c.getLocalDate());
                System.out.println(c.getLocalTime());
                System.out.println(c.getString());
            }
            else {
                System.out.println("Дата не найдена");
            }
        }
    }
}
