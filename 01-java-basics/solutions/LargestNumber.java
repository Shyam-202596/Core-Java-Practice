//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(findMax(num1, num2));
        sc.close();
    }
    static int findMax(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
}
