//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.*;
public class FindingHCFAndLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("First number: " + num1);
        int num2 = sc.nextInt();
        System.out.println("Second number: " + num2);
        System.out.println("HCF of "+ num1 + " and "+ num2 + " is "+ hcf(num1, num2));
        System.out.println("LCM of "+ num1 + " and "+ num2 + " is "+ lcm(num1, num2));

        sc.close();
    }
    static int hcf(int num1, int num2){
	    while(num2 != 0){
	        int temp = num2;
	        num2 = num1 % num2;
	        num1 = temp;
	    }
	    return num1;
	}
	static int lcm (int num1, int num2){
	    int hcf = hcf(num1, num2);
	    return (num1 * num2) / hcf;
	}
}
