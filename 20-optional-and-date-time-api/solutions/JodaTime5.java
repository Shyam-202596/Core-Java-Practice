import java.time.Year;

public class JodaTime5 {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 2016;
        Year y = Year.of(n); //create Year class object with that year.
        boolean flag = y.isLeap(); //flag is true if leap
        if(flag){
            System.out.printf("%nYear %d in Leap.", n);
        }else{
            System.out.printf("%nYear %d is not Leap.", n);
        }
    }
}
