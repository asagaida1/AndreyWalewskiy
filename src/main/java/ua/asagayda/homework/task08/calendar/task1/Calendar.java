package ua.asagayda.homework.task08.calendar.task1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calendar {
    private LocalDate localDate;
    private LocalTime localTime;
    private String string;
    List <Calendar> list = new ArrayList<>();

    public Calendar(LocalDate localDate, LocalTime localTime, String string) {
        this.localDate = localDate;
        this.localTime = localTime;
        this.string = string;
    }

    public void addToList(Calendar calendar){
        list.add(calendar);
    }

    public void conteinsList(LocalDate localDate){

    }


    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public String getString() {
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendar)) return false;
        Calendar calendar = (Calendar) o;
        return localDate.equals(calendar.localDate) &&
                localTime.equals(calendar.localTime) &&
                string.equals(calendar.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDate, localTime, string);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "localDate=" + localDate +
                ", localTime=" + localTime +
                ", string='" + string + '\'' +
                '}';
    }
}
