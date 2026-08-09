//Input a year and find whether it is a leap year or not.
import java.util.*;
public class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year: ");
	    int year = sc.nextInt();

		boolean ans = isLeap(year);
		System.out.println(ans);

        sc.close();
    }
    static boolean isLeap(int year){
	    //1st approach.
	    boolean leap = year % 100 == 0 ? (year % 400 == 0 ? true : false) : (year % 4 == 0 ? true : false);
	    return leap;
	    //2nd approach.
	    //return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
}