package ua.asagayda.homework.task08.calendar.task1;

import java.util.ArrayList;
import java.util.List;

public class CalendarToList {
    Calendar calendar;
    List list = new ArrayList();

    public CalendarToList(Calendar calendar) {
        this.calendar = calendar;
        list.add(calendar);
    }
}
