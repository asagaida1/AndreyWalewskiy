package ua.asagayda.homework.task08.calendar.task1;

//1)  Выводить текущее время и дату в нескольких тайм-зонах(на выбор). При выводе даты и времени выводить также события на данный день.
//2) Создавать событие на конкретную дату и по требованию пользователя выводить список событий. Добавить возможность удалять события.
//3) Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и выводить текущее время, день недели в этой тайм-зоне.
//4) По требованию пользователя выводить в консоль дату через неделю, месяц, год.

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

        MyCalendar myCalendar = new MyCalendar(LocalDate.of(2020,8,1), LocalTime.of(10,10),"Go to work");
        System.out.println(myCalendar.toString());
        myCalendar.addEvent(myCalendar);
        System.out.println(myCalendar.list);
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,2), LocalTime.of(10,10),"Go to work"));
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,3), LocalTime.of(10,10),"Go to work"));
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,3), LocalTime.of(18,15),"Go to home"));
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,3), LocalTime.of(21,00),"Go to sleep"));
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,3), LocalTime.of(22,00),"Go to pi-pi"));
        myCalendar.addEvent(new MyCalendar(LocalDate.of(2020,8,3), LocalTime.of(23,00),"Go to watch tv"));
        System.out.println(myCalendar.list);

        myCalendar.conteinsLocalDate(LocalDate.of(2020,8,3));
        myCalendar.conteinsEvent("Go to home");
        System.out.println("=================================");
        System.out.println("Добавить возможность удалять события.");
        myCalendar.delEventOnLocalDate(LocalDate.of(2020,8,3));
        System.out.println(myCalendar.list);
        System.out.println("=================================");
        System.out.println("AllAvailableCaledarZones: ");
        myCalendar.getAllAvailableCaledarZones();
        System.out.println("=================================");
        System.out.println("Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и выводить текущее время, день недели в этой тайм-зоне.");

        myCalendar.getDateTimeWithZoneSameInstant("US/Pacific");
        myCalendar.getDateTimeWithZoneSameInstant("Europe/Monaco");
        System.out.println("=================================");
        System.out.println("По требованию пользователя выводить в консоль дату через неделю, месяц, год.");
        myCalendar.getLockalDateTimePlusWeek(2);
        myCalendar.getLockalDateTimePlusMonth(2);
        myCalendar.getLockalDateTimePlusYears(2);
        System.out.println("=================================");
        System.out.println("По требованию пользователя выводить в консоль только время и/или дату, день недели, номер дня в году, количество дней оставшеееся до Нового Года.");



    }
}
