package ua.asagayda.homework.task08.calendar.task2;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ShowCurrentDataTimeInDiffZones {
    public void LocalDateTime(){
        LocalDateTime localNow = LocalDateTime.now();
        String s = new String(localNow.toString());
        System.out.println(s);
    }
    public void AsiaKolkata(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedUTC = localDateTime.atZone(ZoneId.of("UTC"));
        ZonedDateTime zonedAsiaKolkata = zonedUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        String s = new String(zonedAsiaKolkata.toString());
        System.out.println(s);
    }
    public void AmericaPanama(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedUTC = localDateTime.atZone(ZoneId.of("UTC"));
        ZonedDateTime zonedAsiaKolkata = zonedUTC.withZoneSameInstant(ZoneId.of("America/Panama"));
        String s = new String(zonedAsiaKolkata.toString());
        System.out.println(s);
    }
}
