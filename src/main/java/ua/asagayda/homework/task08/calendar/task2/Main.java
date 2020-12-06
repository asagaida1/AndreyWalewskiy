package ua.asagayda.homework.task08.calendar.task2;

import java.time.Clock;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Show Current date and time in different zones");
        ShowCurrentDataTimeInDiffZones deffZones = new ShowCurrentDataTimeInDiffZones();
        deffZones.LocalDateTime();
        deffZones.AsiaKolkata();
        deffZones.AmericaPanama();
        System.out.println();

        System.out.println("add new event");
        CalendarEvents calendarEvents = new CalendarEvents();
//        calendarEvents.addEvent("Go to Work", LocalDateTime.of(2020,12, 01, 15, 00));


    }
}
