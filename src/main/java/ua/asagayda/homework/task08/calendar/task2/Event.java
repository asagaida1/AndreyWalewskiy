package ua.asagayda.homework.task08.calendar.task2;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
    private LocalDateTime localDateTime;
    private String eventName;

    public Event(LocalDateTime localDateTime, String eventName) {
        this.localDateTime = localDateTime;
        this.eventName = eventName;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Event setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getLocalDateTime().equals(event.getLocalDateTime()) &&
                getEventName().equals(event.getEventName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocalDateTime(), getEventName());
    }
}
