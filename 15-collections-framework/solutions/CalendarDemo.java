import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) throws java.lang.Exception {
        //Calendar class
        Calendar cl = Calendar.getInstance(); //to create object to Calendar class.
        System.out.print("Current date: ");
        int dd = cl.get(Calendar.DATE);
        int mm = cl.get(Calendar.MONTH);
        ++mm;
        int yyyy = cl.get(Calendar.YEAR);
        System.out.println(dd + "-" + mm + "-" + yyyy);
        System.out.print("Current time: ");
        int hr = cl.get(Calendar.HOUR);
        int mn = cl.get(Calendar.MINUTE);
        int sd = cl.get(Calendar.SECOND);
        System.out.println(hr + ":" + mn + ":" + sd);
        int x = cl.get(Calendar.AM_PM); // returns 0 for AM and 1 for PM.
        if(x == 0){
            System.out.println("Good Morning");
        }else{
            System.out.println("Good Evening");
        }
    }
}
