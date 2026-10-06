import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTime {
    public static void main(String[] args) throws java.lang.Exception {
        LocalDate today = LocalDate.now(); // gives system date into LocalDate obj (yyyy-mm-dd).
        LocalTime time = LocalTime.now(); // gives system time into LocalTime obj (hh:mm:ss.sss).
        System.out.println(today);
        System.out.println(time);
    }
}
