import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTime3 {
    public static void main(String[] args) throws java.lang.Exception {
        ZoneId zone = ZoneId.systemDefault();
        System.out.printf("%nCurrent timezone: %s", zone);
        LocalDateTime dt = LocalDateTime.now();
        System.out.printf("%nDate and Time in India: %s", dt);
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(la);
        System.out.printf("%nDate and Time in Los Angeles: %s", zdt);
    }
}
