import java.awt.*;

void main() {

    // Date & Time (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
    LocalDate date = LocalDate.now(); // Returns current date
    LocalTime time = LocalTime.now(); // Returns current Time
    LocalDateTime dateTime = LocalDateTime.now(); // Returns both current date and time
    Instant instant = Instant.now(); // Returns UTC Timestamp

    // Adding and Subtracting Time
    // 'LocalDateTime' has both 'LocalTime' and 'LocalDate' methods
    LocalTime prevMinute = LocalTime.now().minusMinutes(1);
    LocalTime prevHour = LocalTime.now().minusHours(1);

    LocalTime nextMinute = LocalTime.now().plusMinutes(1);
    LocalTime nextHour = LocalTime.now().plusHours(1);

    LocalDate tomorrow = LocalDate.now().plusDays(1);
    LocalDate nextWeek = LocalDate.now().plusWeeks(1);
    LocalDate nextYear = LocalDate.now().plusYears(1);

    LocalDate yesterday = LocalDate.now().minusDays(1);
    LocalDate lastWeek = LocalDate.now().minusWeeks(1);
    LocalDate lastYear = LocalDate.now().minusYears(1);

    // Formatting and Parsing 'DateTime'
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("""
            yyyy-MM-dd
            dd/MM/yyyy
            MMMM dd, yyyy
            yyyy-MM-dd HH:mm:ss
            EEEE, MMMM dd, yyyy
            EEE, MMM dd, yyyy hh:mm a
            """);
    String newDateTime = dateTime.format(formatter);
    LocalDateTime parsed = LocalDateTime.parse("""
            2025-11-12
            12/11/2025
            November 12, 2025
            2025-11-12 20:24:40
            Wednesday, November 12, 2025
            Wed, Nov 12, 2025 08:24 PM
            """, formatter);

    // Comparing Date and Time
    LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0); // CHRISTMAS
    LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0); // NEW YEARS DAY
    boolean isBefore = date1.isBefore(date2);
    boolean isAfter = date2.isAfter(date1);
    boolean isEqual = date1.isEqual(date1);

    // Duration of Time and Period of Date
    Duration duration = Duration.between(LocalTime.of(9, 0), LocalTime.of(17, 0)); // Hours/minutes
    Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.now());     // Years/months/days
}