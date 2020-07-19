package lessons;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class LearnDate {
    public static void main(String[] args) {
        Date date = new Date();

        date.setYear(2019);

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, 5);

//        System.out.println(calendar);

        LocalDate now = LocalDate.now();

        LocalDate localDate = now.plusDays(6);

//        System.out.println(localDate);

        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));

//        System.out.println(now1);

        System.out.println(LocalDateTime.now().with(TemporalAdjusters.lastDayOfYear()));

//        System.out.println(Year.now());

//        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d:MMM:uuuu");

//        System.out.println(LocalDateTime.now().format(formatter));

        ZonedDateTime dateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Los_Angeles"));

        System.out.println(dateTime);

        ZonedDateTime time = dateTime.withZoneSameInstant(ZoneId.of("Europe/Kiev"));

        System.out.println(time);
    }
}
