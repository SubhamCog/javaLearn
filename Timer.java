import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timer {
    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Format the time (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // 24-hour format
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Time (HH:mm:ss): " + formattedTime);

        DateTimeFormatter formatterAmPm = DateTimeFormatter.ofPattern("hh:mm:ss a"); // 12-hour format with AM/PM
        String formattedTimeAmPm = currentTime.format(formatterAmPm);
        System.out.println("Current Time (hh:mm:ss a): " + formattedTimeAmPm);
    }
}