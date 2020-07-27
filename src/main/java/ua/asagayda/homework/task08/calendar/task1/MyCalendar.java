package ua.asagayda.homework.task08.calendar.task1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyCalendar {
    private LocalDate localDate;
    private LocalTime localTime;
    private String string;
    List <MyCalendar> list = new ArrayList<>();

    public MyCalendar(LocalDate localDate, LocalTime localTime, String string) {
        this.localDate = localDate;
        this.localTime = localTime;
        this.string = string;
    }

    public void addEvent(MyCalendar myCalendar){
        list.add(myCalendar);
    }


    public void conteinsLocalDate(LocalDate localDate){
        for (MyCalendar c: list) {
            if(c.getLocalDate().equals(localDate)){
                System.out.println("---");
                System.out.println("Дата содержится");
                System.out.println(c.getLocalDate());
                System.out.println(c.getLocalTime());
                System.out.println(c.getString());
            }
            else{
                System.out.println("Дата не найдена");
            }
        }
    }
    public void conteinsEvent(String s){
        for (MyCalendar c: list) {
            if(c.getString().equals(s)){
                System.out.println("---");
                System.out.println("Событие содержится");
                System.out.println(c.getLocalDate());
                System.out.println(c.getLocalTime());
                System.out.println(c.getString());
            }
            else{
                System.out.println("Дата не найдена");
            }

        }

    }

//    public void delEventOnLocalDate (LocalDate localDate) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getLocalDate().equals(localDate)) {
//                System.out.println("Event can be remove. LocalDate is equals");
//                System.out.println(list.get(i).getLocalDate());
//                System.out.println(list.get(i).getLocalTime());
//                System.out.println(list.get(i).getString());
//                list.remove(i);
//                continue;
//            }
//        }
//        System.out.println("End cycle");
//    }

    public void delEventOnLocalDate(LocalDate localDate) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (localDate.equals(list.get(j).getLocalDate())) {
                    System.out.println("Event can be remove. LocalDate is equals");
                    System.out.println(list.get(j).getLocalDate());
                    System.out.println(list.get(j).getLocalTime());
                    System.out.println(list.get(j).getString());
                    list.remove(j);
                }
                System.out.println("End j(sub) cycle");
            }
        }
        System.out.println("End main cycle");
    }


//        for (MyCalendar c: list) {
//            if(c.getLocalDate().equals(localDate)){
//                System.out.println("---");
//                System.out.println("Событие содержитдату и будет удалено:");
//                System.out.println(c.getLocalDate());
//                System.out.println(c.getLocalTime());
//                System.out.println(c.getString());
//                c.;
//            }
//            else{
//                System.out.println("Дата не найдена");
//            }
//
//        }
//
//    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCalendar)) return false;
        MyCalendar that = (MyCalendar) o;
        return getLocalDate().equals(that.getLocalDate()) &&
                getLocalTime().equals(that.getLocalTime()) &&
                getString().equals(that.getString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocalDate(), getLocalTime(), getString());
    }

    @Override
    public String toString() {
        return "MyCalendar{" +
                "localDate=" + localDate +
                ", localTime=" + localTime +
                ", string='" + string + '\'' +
                '}';
    }
}