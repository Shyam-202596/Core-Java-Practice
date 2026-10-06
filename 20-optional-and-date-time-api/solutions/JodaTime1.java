import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTime1 {
    public static void main(String[] args) throws java.lang.Exception {
        LocalDate date = LocalDate.now(); // gives system date into LocalDate obj (yyyy-mm-dd).
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.printf("\n%d-%d-%d", dd, mm, yy);
        LocalTime time = LocalTime.now(); // gives system time into LocalTime obj (hh:mm:ss.sss).
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.printf("\n%d:%d:%d.%d", h, m, s, n);
    }
}
