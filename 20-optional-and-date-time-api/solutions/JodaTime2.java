import java.time.LocalDateTime;
import java.time.Month;

public class JodaTime2 {
    public static void main(String[] args) throws java.lang.Exception {
        LocalDateTime dt = LocalDateTime.now();
        System.out.printf("%nLocalDateTime object with current date and time: %n%s", dt);
        LocalDateTime dt1 = LocalDateTime.of(1996, Month.JANUARY, 05, 11, 11);
        System.out.printf("%nLocalDateTime object with some date and time: %n%s", dt1);
        System.out.printf("%n5 months from now: %n%s", dt.plusMonths(5));
        System.out.printf("%n5 months ago: %n%s", dt.minusMonths(5));
        //DayOFWeek dw = dt.getDayOfWeek();
        //String s = dw.name();
        //System.out.printf("%nDay of the week name: %n%s", s);
        //int n = dw.getValue();
        //System.out.printf("%nDay of the week value: %n%s", n);
    }
}
