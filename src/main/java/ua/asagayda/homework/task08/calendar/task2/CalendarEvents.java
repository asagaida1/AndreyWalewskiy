package ua.asagayda.homework.task08.calendar.task2;

import java.util.ArrayList;
import java.util.List;

public class CalendarEvents {
    private Event event;
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event){
        if (eventList.contains(event)){
            System.out.println("This object Event, already exist");
        }
        else eventList.add(event);

        eventList.add(event);
    }


}
