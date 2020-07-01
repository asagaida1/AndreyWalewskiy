package ua.asagayda.homework.task08.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getTimezoneOffset());

        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId z = ZoneId.of( "America/Montreal" );
        ZonedDateTime zdt = instant.atZone( z );
        System.out.println(zdt);
        System.out.println("========================");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date1 = new Date();
        SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTime= dateParser.parse(format.format(date1));
        long gmtMilliSeconds = dateTime.getTime();
        System.out.println("==========================");

        LocalDate today = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(today);
        System.out.println(localDateTime);
        localDateTime.plusMinutes(600);
        System.out.println(localDateTime.plusMinutes(600));
        System.out.println(localDateTime.now(ZoneOffset.UTC).plusMinutes(15));
        System.out.println(localDateTime.now(ZoneOffset.UTC).plusMinutes(30));

    }
}
