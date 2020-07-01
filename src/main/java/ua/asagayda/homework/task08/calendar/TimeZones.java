package ua.asagayda.homework.task08.calendar;

import java.util.GregorianCalendar;

public class TimeZones {
    private GregorianCalendar calendar;
    private int timeZone;

    GregorianCalendar getCalendar = new GregorianCalendar();

    public int getTimeZone() throws IllegalArgumentException{
        if (this.timeZone > 23) {
            throw new IllegalArgumentException("Cannot set timezones greater than 24h");
        }
        return timeZone;
    }

    public TimeZones setTimeZone(int timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
