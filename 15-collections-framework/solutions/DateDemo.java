import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
    public static void main(String[] args) throws java.lang.Exception {
        //Date class
        Date d = new Date();
        System.out.print("Default date & time: " + d);
        System.out.println();
        DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, Locale.UK);
        String str = fmt.format(d);
        System.out.print("Formatted Date & time: " + str);

    }
}
