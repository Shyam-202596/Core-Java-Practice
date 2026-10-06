import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class JodaTime4 {
    public static void main(String[] args) throws java.lang.Exception {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996, Month.JANUARY, 5);
        Period p = Period.between(birthday, today);
        System.out.printf("You are %d years %d months and %d days older:", p.getYears(), p.getMonths(), p.getDays());
    }
}
