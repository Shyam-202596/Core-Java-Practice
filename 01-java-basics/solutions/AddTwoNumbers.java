//Take two numbers and print the sum of both.
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int ans = add(num1, num2);    
        System.out.println("Sum of both the number is: " + ans);

        sc.close();
    }
    static int add(int num1, int num2){
	    return num1 + num2;
	}
}
