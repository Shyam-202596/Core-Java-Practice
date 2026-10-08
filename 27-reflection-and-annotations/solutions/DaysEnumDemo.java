import java.util.Arrays;

public class DaysEnumDemo {
    public static void main(String[] args) throws java.lang.Exception {
        Days[] allDays = Days.values();
        System.out.println(Arrays.toString(allDays));
        for(Days d : allDays){
            System.out.println(d);
        }
    }
}
enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
