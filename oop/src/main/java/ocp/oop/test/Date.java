package ocp.oop.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Date {

  public static void main(String[] args) {
    String nextDate = "20250519";
    String formattedDate = String.format("%s-%s-%s",
      nextDate.substring(0, 4), // Year
      nextDate.substring(4, 6), // Month
      nextDate.substring(6)     // Day
    );
    System.out.println(formattedDate);

    // Virement Tunisie Permanent\nREF : MYBT1234567890
    System.out.println("Virement Tunisie Permanent\nREF : MYBT1234567890".split(":") [1].trim());

/*    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
    OffsetDateTime dateTime = OffsetDateTime.parse("2025-01-22 10:35:48.798950", formatter);

    System.out.println(dateTime);*/

    String dateTimeStr = "2025-01-22 10:35:48.798950"; // Your OffsetDateTime string

    // Define the formatter matching your pattern
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

    // Parse string to OffsetDateTime (assuming UTC offset, modify if needed)
    OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeStr, formatter.withZone(ZoneOffset.UTC));


    // Convert to LocalDate
    LocalDate localDate = offsetDateTime.toLocalDate();

    System.out.println("OffsetDateTime: " + offsetDateTime);
    System.out.println("LocalDate: " + localDate);

  }
}
